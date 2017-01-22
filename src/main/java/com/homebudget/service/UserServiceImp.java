package com.homebudget.service;

import com.homebudget.model.Purse;
import com.homebudget.model.Role;
import com.homebudget.model.User;
import com.homebudget.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImp implements UserService {

    @Autowired
    public UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private PurseServiceImpl purseService;

//    private Purse purse = purseService.createPurse(new Purse(0.00, "Кошелек"));


    @Override
    public User createUser(User user) {
        user.setRole(Role.USER);
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        purseService.createPurse(new Purse(0.00, "Кошелек")).setUser(user);
        return userRepository.save(user);
    }

    @Override
    public void updateUser(User user) {
        User entity = userRepository.findOne(user.getId());

        if(entity != null) {
            entity.setId(user.getId());
            entity.setLogin(user.getLogin());
            entity.setRole(user.getRole());
            entity.setPassword(user.getPassword());
        }
    }

    @Override
    public void deleteUser(int id) {
        userRepository.delete(id);
    }

    @Override
    public User getUserById(int id) {
        return userRepository.findOne(id);
    }

    @Override
    public User getUserByLogin(String login) {
        return userRepository.getUserByLogin(login);
    }

    @Override
    public List<User> userList() {
        return (List<User>) userRepository.findAll();
    }
}
