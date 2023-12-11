package com.heima.mapper;

import com.heima.pojo.User;
import org.apache.ibatis.annotations.*;

@Mapper
public interface UserMapper {

    @Select("select * from user where id = #{id}")
    public User findUserById(Integer id);

    @Insert("INSERT INTO user (id, name, age, gender, phone) VALUES (#{id}, #{name}, #{age}, #{gender}, #{phone})")
    void createUser(User user);

    @Delete("Delete from user where id = ${id}")
    void deleteUserById(Integer id);

}
