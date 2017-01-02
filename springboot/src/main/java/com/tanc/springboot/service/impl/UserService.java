package com.tanc.springboot.service.impl;

import com.tanc.springboot.entity.User;
import com.tanc.springboot.mapper.UserMapper;
import com.tanc.springboot.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUserById(int id) {
        return userMapper.query(id);
    }
}
