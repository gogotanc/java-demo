package com.tanc.springboot.controller;

import com.tanc.springboot.entity.User;
import com.tanc.springboot.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 主控制器
 *
 * @author tanc
 */
@RestController
@RequestMapping("/user")
public class MainController {

    @Autowired
    private IUserService userService;

    @RequestMapping("/index")
    public String index() {
        return "hello spring boot";
    }

    @RequestMapping("/{id}")
    public String query(@PathVariable("id") Integer id) {
        User user = userService.getUserById(id);
        return null == user ? "null" : user.toString();
    }
}
