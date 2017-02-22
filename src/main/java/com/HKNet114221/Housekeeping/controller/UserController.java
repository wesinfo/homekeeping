package com.HKNet114221.Housekeeping.controller;

import com.HKNet114221.Housekeeping.dao.UserMapper;
import com.HKNet114221.Housekeeping.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by xgpeng on 2017-2-22.
 */
@RestController @RequestMapping({ "/api" }) public class UserController {
    @Autowired UserMapper userMapper;

    @RequestMapping(value = "/user") @ResponseBody public String user() {
        User user = userMapper.findUserByName("彭小刚");
        return user.getName() + "-----" + user.getPassword();
    }

}
