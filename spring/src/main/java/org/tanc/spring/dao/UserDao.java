package org.tanc.spring.dao;

import org.tanc.spring.entity.User;

/**
 * 用户信息表
 * Created by tanc on 2017/7/20.
 */
public class UserDao {

    public User getUserById(int id) {

        User user = new User();
        user.setId(id);

        switch (id) {
            case 1:
                user.setName("tanc");
                user.setAge(25);
                user.setAddress("chengdu");
                break;
            case 2:
                user.setName("molly");
                user.setAge(26);
                user.setAddress("guilin");
                break;
            default:
                user.setName("nobody");
                user.setAddress("earth");
                user.setAge(99);
        }

        return user;
    }
}
