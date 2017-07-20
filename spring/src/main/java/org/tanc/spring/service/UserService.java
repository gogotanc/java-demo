package org.tanc.spring.service;

import org.tanc.spring.dao.UserDao;
import org.tanc.spring.entity.User;

/**
 * 用户服务
 * Created by tanc on 2017/7/20.
 */
public class UserService {

    private UserDao userDao;

    public User getUser(int id) {
        return userDao.getUserById(id);
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
