package com.crudspring.crud_spring.service;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import com.crudspring.crud_spring.entity.user;
import com.crudspring.crud_spring.repository.userRep;


@Service
public class userService {

    private userRep userResp;

    public user SaveUser(user user){
        return userResp.save(user);
    }
    public List<user> findAll() {
        return userResp.findAll();
    }
    public Optional<user> findById(String id) {
        return userResp.findById(id);
    }

}
