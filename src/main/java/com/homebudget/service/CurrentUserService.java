package com.homebudget.service;


import com.homebudget.model.CurrentUser;

public interface CurrentUserService {

    boolean canAccessUser(CurrentUser currentUser, Integer userId);

}
