package com.homebudget.repository;

import com.homebudget.model.Purse;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PurseRepository extends CrudRepository<Purse, Integer> {
}
