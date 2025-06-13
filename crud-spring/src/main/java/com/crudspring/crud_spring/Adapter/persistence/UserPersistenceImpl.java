package com.crudspring.crud_spring.Adapter.persistence;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.stereotype.Component;
import com.crudspring.crud_spring.core.Model.UserModel;
import com.crudspring.crud_spring.core.Users.Port.out.UserPersistence;
import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class UserPersistenceImpl implements UserPersistence {

    private final MongoTemplate mongoTemplate;

    @Override
    public List<UserModel> getAllUser() {
        return mongoTemplate.findAll(UserModel.class);
    }

    @Override
    public Optional<UserModel> getUserByname(String nome) {
        Query query = new Query(Criteria.where("nome").is(nome));
        return Optional.ofNullable(mongoTemplate.findOne(query, UserModel.class));
    }
}

