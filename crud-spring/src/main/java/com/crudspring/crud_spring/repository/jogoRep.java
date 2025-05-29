package com.crudspring.crud_spring.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.crudspring.crud_spring.entity.jogos;

@Repository
public interface jogoRep extends MongoRepository <jogos, String> {

}
