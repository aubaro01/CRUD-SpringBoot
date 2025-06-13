package com.crudspring.crud_spring.Adapter.dto.Response;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)

public class UserServiceResponse {

    private String id;
    private String nome;
    private String circuito;
}
