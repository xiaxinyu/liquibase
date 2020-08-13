package com.xiaxinyu.liquibase.web;

import com.xiaxinyu.liquibase.model.User;
import com.xiaxinyu.liquibase.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    IUserService userService;

    @GetMapping("/user/{id}")
    public User find(@PathVariable Integer id) {
        return userService.getById(id);
    }
}
