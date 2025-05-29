package com.crudspring.crud_spring.entity;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Document(collection = "jgos")
@Getter
@Setter
@AllArgsConstructor
@Builder

public class jogos {
    private String id;
    private String UserId;
    private String NomeJog;
}
