package com.crudspring.crud_spring.core.Users.Port.in;

import java.util.List;
import java.util.Optional;

import com.crudspring.crud_spring.core.Model.UserModel;


public interface UserOperations {

    List <UserModel> getAllUser ()  ;
    Optional <UserModel> getUserByname (String nome);

}
