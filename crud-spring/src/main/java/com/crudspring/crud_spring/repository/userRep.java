package com.crudspring.crud_spring.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.crudspring.crud_spring.entity.user;

@Repository
public interface userRep extends MongoRepository<user, String>{



}
