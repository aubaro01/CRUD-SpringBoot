package com.crudspring.crud_spring.core.Users.Port.out;

import java.util.List;
import java.util.Optional;

import com.crudspring.crud_spring.core.Model.UserModel;

public interface UserPersistence {
    List<UserModel> getAllUser();

    Optional<UserModel> getUserByname(String nome);
}
