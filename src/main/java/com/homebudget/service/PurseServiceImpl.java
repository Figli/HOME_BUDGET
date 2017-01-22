package com.homebudget.service;

import com.homebudget.model.Purse;
import com.homebudget.repository.PurseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PurseServiceImpl implements PurseService {

    @Autowired
    PurseRepository purseRepository;

    @Override
    public Purse createPurse(Purse purse) {
        return purseRepository.save(purse);
    }

    @Override
    public void updatePurse(Purse purse) {
        Purse entity = purseRepository.findOne(purse.getId());

        if(entity != null) {
            entity.setId(purse.getId());
            entity.setPurseName(purse.getPurseName());
            entity.setPurseBalans(purse.getPurseBalans());
        }
    }

    @Override
    public void deletePurse(int id) {
        purseRepository.delete(id);
    }

    @Override
    public Purse getPurseById(int id) {
        return purseRepository.findOne(id);
    }
}
