package com.homebudget.repository;

import com.homebudget.model.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Integer>{

    @Query("select b from User b where b.login = :login")
    User getUserByLogin(@Param("login") String login);
}
