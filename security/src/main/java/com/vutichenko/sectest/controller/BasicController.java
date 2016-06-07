package com.vutichenko.sectest.controller;


import com.vutichenko.sectest.dao.UserDao;
import com.vutichenko.sectest.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by vutichenko on 30.05.2016.
 */
@Controller
@RequestMapping("/")
public class BasicController {
    @Autowired
    UserDao dao;
    @RequestMapping(method = RequestMethod.GET)
    public String sayHello(ModelMap model) {
        User user = new User();
        user.setPassword("12345");
        user.setLogin("login1");
        dao.updateUser(user);
        model.addAttribute(dao.getUserByLogin("login1").getPassword(), "Hello World Again, from Spring 4 MVC");
        return "welcome";
    }
    @RequestMapping(value = "/playwithme", method = RequestMethod.GET)
    public String sayHelloAgain(ModelMap model) {
        User user = new User();
        user.setPassword("12345");
        user.setLogin("login1");
        dao.updateUser(user);
        model.addAttribute(dao.getUserByLogin("login1").getPassword(), "Hello World Again, from Spring 4 MVC");
        return "welcome";
    }
}
