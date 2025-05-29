package com.crudspring.crud_spring.service;
import org.springframework.stereotype.Service;
import com.crudspring.crud_spring.entity.user;
import com.crudspring.crud_spring.repository.userRep;


@Service
public class userService {

    private userRep userResp;

    public user SaveUser(user user){
        return userResp.save(user);
    }

}
