package com.HKNet114221.Homekeeping.config;

import com.HKNet114221.Homekeeping.jwt.*;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.*;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration @EnableWebSecurity public class WebSecurityConfig
        extends WebSecurityConfigurerAdapter {

    @Override protected void configure(HttpSecurity http) throws Exception {
        http.headers().cacheControl();

        http.csrf().disable() // disable csrf for our requests.
                .authorizeRequests().antMatchers("/").permitAll()
                .antMatchers("/*.js").permitAll().antMatchers("/*.html")
                .permitAll().antMatchers("/*.css").permitAll()
                .antMatchers("/*.map").permitAll().antMatchers("/*.woff")
                .permitAll().antMatchers("/*.woff2").permitAll()
                .antMatchers("/*.ttf").permitAll().antMatchers("/*.eot")
                .permitAll().antMatchers("/*.gif").permitAll()
                .antMatchers("/*.svg").permitAll().antMatchers("/*.ico")
                .permitAll().antMatchers(HttpMethod.POST, "/login").permitAll()
                .anyRequest().authenticated().and()
                // filter the login requests
                .addFilterBefore(
                        new JWTLoginFilter("/login", authenticationManager()),
                        UsernamePasswordAuthenticationFilter.class)
                // And filter other requests to check the presence of JWT in header
                .addFilterBefore(new JWTAuthenticationFilter(),
                        UsernamePasswordAuthenticationFilter.class);
    }
}
