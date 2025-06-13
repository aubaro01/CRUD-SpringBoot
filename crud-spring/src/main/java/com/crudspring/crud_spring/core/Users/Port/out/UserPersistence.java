package com.crudspring.crud_spring.core.Users.Port.out;

import java.util.List;

import com.crudspring.crud_spring.core.Model.UserModel;

public interface UserPersistence {
    List<UserModel> getAllUser();
    List<UserModel> getUserByname(String nome);
    UserModel insertNewUser (UserModel model);
    UserModel updateUser (UserModel model);

}
