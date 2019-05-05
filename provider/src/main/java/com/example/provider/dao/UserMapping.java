package com.example.provider.dao;

import entity.User;


import java.util.List;
import java.util.Map;

public interface UserMapping {

    List<User> getUserList(Map<String, String> map);

    int deleteByPrimaryKey(Integer id);

    //int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    //int updateByPrimaryKey(User record);
}
