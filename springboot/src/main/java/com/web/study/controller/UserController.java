package com.web.study.controller;

import com.web.study.dao.UserDao;
import com.web.study.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/api/user")
public class UserController {
    @Autowired
    UserDao userDao;

    @ResponseBody
    @RequestMapping("/login")
    public String login(@RequestBody User req) {
        final User user = userDao.getUserByUsername(req.getUsername(), req.getPassword());
        if (user != null) {
            return "ok";
        } else {
            return "no";
        }
    }

    @ResponseBody
    @RequestMapping("/signup")
    public String signup(@RequestBody User req) {
        if (userDao.selectUserByUsername(req.getUsername()) == null) {
            userDao.insert(req.getUsername(), req.getPassword());
            return "ok";
        } else {
            return "no";
        }
    }

}
