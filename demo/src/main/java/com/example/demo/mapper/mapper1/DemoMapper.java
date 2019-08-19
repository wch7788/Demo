package com.example.demo.mapper.mapper1;

import com.example.demo.bean.User;
import org.apache.ibatis.annotations.Select;


public interface DemoMapper {

    @Select("select * from user where id = #{id}")
    User findUser(int id);
}
