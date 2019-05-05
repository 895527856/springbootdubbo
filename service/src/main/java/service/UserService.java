package service;

import com.alibaba.fastjson.JSONObject;
import entity.User;


import java.util.Map;


public interface UserService {

    public User getUserById(int userId) ;

    public Map<String,String> deleteUserById(int userId) ;

    public Map<String,String> addUser(User user);

    public Map<String,String> updateUser(User user);

    public JSONObject getUserList(Map<String, String> map);
}
