package com.example.demo.mapper.mapper2;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @ Author     ：WuChenHui
 * @ Date       ：Created in 3:26 PM 8/19/2019
 * @ Description：studentmapper
 * @ Version:     1.0$
 */

public interface StudentMapper {

    @Select("select name from student where id = #{id}")
    String findById(int id);
}
