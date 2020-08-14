package com.mapsa.controller;

import com.mapsa.dao.UserDao;
import com.mapsa.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class HelloController {

    @Autowired
    private UserDao userDao;

    @RequestMapping("/")
    public String index(){
        userDao.findAllUsers();
        return "index";
    }

    @RequestMapping("/users")
    public String users(Model model){
        List<User> users = userDao.findAllUsers() ;
        model.addAttribute("users",users.get(0));
        return "users";

    }
}
