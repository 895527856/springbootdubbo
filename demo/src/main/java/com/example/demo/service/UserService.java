package com.example.demo.service;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.dao.UserDao;
import com.example.demo.entity.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;


public interface UserService {

    public User getUserById(int userId) ;

    public Map<String,String> deleteUserById(int userId) ;

    public Map<String,String> addUser(User user);

    public Map<String,String> updateUser(User user);

    public JSONObject getUserList(Map<String,String> map);
}
