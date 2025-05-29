package com.crudspring.crud_spring.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;


@Document(collation = "userSpring")
@Getter
@Setter
@AllArgsConstructor
@Builder

public class user {

    @Id
    private String id;
    private String nome;
    private String text;
    
}
