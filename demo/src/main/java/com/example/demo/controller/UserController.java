package com.example.demo.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@RestController
@EnableAutoConfiguration
@RequestMapping("/testboot")
public class UserController {
    @Resource
    UserService userService;

    @RequestMapping("getuser")
    public User getUser() {
        User user = new User();
        user.setName("test");
        return user;
    }

    @RequestMapping("/getUserById")
    @ResponseBody
    public User selectByPrimaryKey (Integer id){
        User user = new User();
        user = userService.getUserById(id);
        return user;
    }

    @RequestMapping("/deleteByPrimaryKey")
    @ResponseBody
    public Map<String,String> deleteByPrimaryKey (Integer id){
        Map<String,String> map = new HashMap<String,String>();
        map = userService.deleteUserById(id);
        return map;
    }

    @RequestMapping("/addUser")
    @ResponseBody
    public Map<String,String> addUser (User user){
        Map<String,String> map = new HashMap<String,String>();
        User u = new User();
        u.setAge(12);
        u.setName("王二");
        u.setSex("男");
        map = userService.addUser(u);
        return map;
    }

    @RequestMapping("/updateUser")
    @ResponseBody
    public Map<String,String> updateUser (User user){
        Map<String,String> map = new HashMap<String,String>();
        User u = new User();
        u.setId(6);
        u.setAge(23);
        map = userService.updateUser(u);
        return map;
    }

    @RequestMapping("/getUserList")
    @ResponseBody
    public JSONObject grtUserList (User user){
        JSONObject json = new JSONObject();
        Map<String,String> pmap = new HashMap<String,String>();
        pmap.put("name","王二");
        json = userService.getUserList(pmap);
        return json;
    }


}
