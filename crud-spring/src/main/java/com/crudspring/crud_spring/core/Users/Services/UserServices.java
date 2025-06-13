package com.crudspring.crud_spring.core.Users.Services;

import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import com.crudspring.crud_spring.core.Model.UserModel;
import com.crudspring.crud_spring.core.Users.Port.in.UserOperations;
import com.crudspring.crud_spring.core.Users.Port.out.UserPersistence;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor

public class UserServices implements UserOperations{
    private final UserPersistence userPersistence ;

    @Override
    public List<UserModel> getAllUser() {
        return userPersistence.getAllUser();
    }

    @Override
    public List<UserModel> getUserByname(String nome) {
        return userPersistence.getUserByname(nome);
    }
}
