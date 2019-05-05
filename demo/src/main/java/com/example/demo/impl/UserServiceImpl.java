package com.example.demo.impl;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.dao.UserDao;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service()
public class UserServiceImpl implements UserService {

    @Resource
    UserDao userDao;

    @Override
    public User getUserById(int userId) {
        Integer d = 1;
        return userDao.selectByPrimaryKey(userId);
    }

    @Override
    public Map<String, String> deleteUserById(int userId) {
        Map<String,String> map = new HashMap<String,String >();
        int num = userDao.deleteByPrimaryKey(userId);
        if(num>0){
            map.put("code","1");
            map.put("msg","删除成功");
        }else{
            map.put("code","-1");
            map.put("msg","删除失败");
        }
        return map;
    }

    @Override
    public Map<String, String> addUser(User user) {
        Map<String,String> map = new HashMap<String,String >();
        int num = userDao.insertSelective(user);
        if(num>0){
            map.put("code","1");
            map.put("msg","增加成功");
        }else{
            map.put("code","-1");
            map.put("msg","增加失败");
        }
        return map;
    }

    @Override
    public Map<String, String> updateUser(User user) {
        Map<String,String> map = new HashMap<String,String >();
        int num = userDao.updateByPrimaryKeySelective(user);
        if(num>0){
            map.put("code","1");
            map.put("msg","修改成功");
        }else{
            map.put("code","-1");
            map.put("msg","修改失败");
        }
        return map;
    }

    @Override
    public JSONObject getUserList(Map<String, String> map) {
        JSONObject json = new JSONObject();
        try{
            List<User> list = userDao.getUserList(map);
            json.put("data",list);
            json.put("code","1");
            json.put("msg","查询成功");
        }catch(Exception e){
            json.put("code","-1");
            json.put("msg","查询失败");
        }
        return json;
    }
}
