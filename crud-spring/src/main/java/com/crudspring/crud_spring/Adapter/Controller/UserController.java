package com.crudspring.crud_spring.Adapter.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.crudspring.crud_spring.Adapter.Mapper.userMapp;
import com.crudspring.crud_spring.Adapter.dto.Response.UserServiceResponse;
import com.crudspring.crud_spring.core.Model.UserModel;
import com.crudspring.crud_spring.core.Users.Port.in.UserOperations;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@AllArgsConstructor
@Slf4j
@RestController
@RequestMapping("/api/v1/users")

public class UserController {

    private final UserOperations userOperations;
    private final userMapp userMapper;


    @GetMapping
    public ResponseEntity<ResponseEnvelope<List<UserServiceResponse>>> getAllUser() {

    List<UserModel> list = userOperations.getAllUser();

    if (list.isEmpty()) {
        log.error("Nenhum usuário encontrado");
       
    }

    List<UserServiceResponse> resp = userMapper.modelsToServiceResponses(list);

    return new ResponseEntity<>(ResponseEnvelope.<List<UserServiceResponse>>builder()
        .content(resp)
        .build(),
        HttpStatus.OK);
}

@GetMapping("/{nome}")
public ResponseEntity<ResponseEnvelope<List<UserServiceResponse>>> getUserByName(@PathVariable("nome") String nome) {
    List<UserModel> users = userOperations.getUserByname(nome);

    if (users.isEmpty()) {
        log.error("Erro ao procurar user com esse nome");
        return ResponseEntity.notFound().build();
    }

        List<UserServiceResponse> resp = userMapper.modelsToServiceResponses(users);


    return ResponseEntity.ok(
    ResponseEnvelope.<List<UserServiceResponse>>builder()
        .content(resp)
        .build()
);

}

}

