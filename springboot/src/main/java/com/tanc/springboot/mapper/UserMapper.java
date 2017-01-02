package com.tanc.springboot.mapper;

import com.tanc.springboot.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {

    @Select("select * from user_tbl where id = #{id}")
    User query(@Param("id") int id);
}
