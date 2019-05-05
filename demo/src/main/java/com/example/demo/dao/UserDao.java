package com.example.demo.dao;

import com.example.demo.entity.User;

import java.util.List;
import java.util.Map;

public interface UserDao {

    List<User> getUserList(Map<String,String> map);

    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}
