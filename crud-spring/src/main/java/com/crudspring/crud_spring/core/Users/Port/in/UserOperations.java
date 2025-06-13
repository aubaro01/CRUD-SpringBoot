package com.crudspring.crud_spring.core.Users.Port.in;

import java.util.List;

import com.crudspring.crud_spring.core.Model.UserModel;


public interface UserOperations {

    List <UserModel> getAllUser ()  ;
    List <UserModel> getUserByname (String nome);
    UserModel insertNewUser (UserModel model);
    UserModel updateUser (UserModel model);


}
