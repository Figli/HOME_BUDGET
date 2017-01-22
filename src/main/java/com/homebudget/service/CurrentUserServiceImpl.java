package com.homebudget.service;


import com.homebudget.model.CurrentUser;
import com.homebudget.model.Role;
import org.springframework.stereotype.Service;

@Service
public class CurrentUserServiceImpl implements CurrentUserService {

    @Override
    public boolean canAccessUser(CurrentUser currentUser, Integer userId) {
        return currentUser != null && (currentUser.getRole() == Role.USER || currentUser.getId().equals(userId));
    }

}
