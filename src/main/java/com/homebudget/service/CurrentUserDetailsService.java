package com.homebudget.service;


import com.homebudget.model.CurrentUser;
import com.homebudget.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CurrentUserDetailsService implements UserDetailsService {

    @Autowired
    private UserService userService;

//    private final UserService userService;
//
//    @Autowired
//    public CurrentUserDetailsService(UserService userService) {
//        this.userService = userService;
//    }

    @Override
    public CurrentUser loadUserByUsername(String login) throws UsernameNotFoundException {
        User user = userService.getUserByLogin(login);
        return new CurrentUser(user);
    }

}
