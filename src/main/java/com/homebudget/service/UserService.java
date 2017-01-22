package com.homebudget.service;

import com.homebudget.model.User;

import java.util.List;

public interface UserService {

    User createUser(User user);

    void updateUser(User user);

    void deleteUser(int id);

    User getUserById(int id);

    User getUserByLogin(String login);

    List<User> userList();
}
