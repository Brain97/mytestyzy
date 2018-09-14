package com.example.demo.dao;

import com.example.demo.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserDAO {
    String INSERT_TABLE  = "[user]";
    String SELECT_TABLE  = "[user]";
    String SELECT_FIELDS = " name, password ";


    @Insert({"insert into ",INSERT_TABLE, "values (#{name},#{password})"})
    void addUser(User user);

    @Select({"select ", SELECT_FIELDS, " from ", SELECT_TABLE, " where name=#{name}"})
    User selectByName(String name);

}
