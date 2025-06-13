package com.crudspring.crud_spring.Adapter.Mapper;

import java.util.List;
import java.util.stream.Collectors;

import org.bson.types.ObjectId;
import org.springframework.stereotype.Component;

import com.crudspring.crud_spring.Adapter.dto.Response.UserServiceResponse;
import com.crudspring.crud_spring.core.Model.UserModel;

@Component
public class userMapp {  

    public List<UserServiceResponse> modelsToServiceResponses(List<UserModel> list) {
        return list.stream()
                   .map(this::modelToResponse)
                   .collect(Collectors.toList());
    }

    public UserModel responseToModel(UserServiceResponse serviceResponse) {
        if (serviceResponse == null) return null;

        UserModel userModel = new UserModel();

        if (serviceResponse.getId() != null) {
            userModel.setId(new ObjectId()); 
        }

        userModel.setNome(serviceResponse.getNome());
        userModel.setCircuito(serviceResponse.getCircuito());

        return userModel;
    }

    public UserServiceResponse modelToResponse(UserModel userModel) {
        if (userModel == null) return null;

        UserServiceResponse response = new UserServiceResponse();

        if (userModel.getId() != null) {
            response.setId(userModel.getId().toString());  
        }

        response.setNome(userModel.getNome());
        response.setCircuito(userModel.getCircuito());

        return response;
    }
}
