package com.HKNet114221.Housekeeping.dao;

import com.HKNet114221.Housekeeping.model.User;
import org.apache.ibatis.annotations.*;

/**
 * Created by xgpeng on 2017-2-22.
 */
@Mapper public interface UserMapper {
    @Select("select * from users where name = #{name}")
    User findUserByName(@Param("name") String name);
}
