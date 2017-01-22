package com.homebudget.service;

import com.homebudget.model.Purse;

public interface PurseService {

    Purse createPurse(Purse purse);

    void updatePurse(Purse purse);

    void deletePurse(int id);

    Purse getPurseById(int id);
}
