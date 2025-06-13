package com.crudspring.crud_spring.Adapter.persistence;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.regex.Pattern;

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
     public List<UserModel> getUserByname(String nome) {
    if (nome == null || nome.isEmpty()) {
        return Collections.emptyList();
    }
    String regexPattern = ".*" + Pattern.quote(nome) + ".*";
    Query query = new Query(Criteria.where("nome").regex(regexPattern, "i"));
    return mongoTemplate.find(query, UserModel.class);
}

}
