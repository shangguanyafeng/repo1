package com.rl.controller;

import com.rl.mapper.UserMapper;
import com.rl.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class YouController {

    @Autowired
     private UserMapper userMapper;

    @RequestMapping("/query")
    @ResponseBody
    public List<User> query(){

          List<User> users=userMapper.queryUserList();

         return users;
     }
}
