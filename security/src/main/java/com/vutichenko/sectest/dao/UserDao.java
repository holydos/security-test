package com.vutichenko.sectest.dao;


import com.vutichenko.sectest.model.User;

/**
 * Created by vutichenko on 30.05.2016.
 */
public interface UserDao {
    void updateUser(User user);
    User getUserByLogin(String login);
}
