package com.crudspring.crud_spring.Adapter.dto.Request;

import jakarta.validation.constraints.NotEmpty;
import lombok.*;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class UserServiceRequestUp {

    @NotEmpty
    private String nome;
    @NotEmpty
    private String circuito;
}
