package com.crudspring.crud_spring.core.Model;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.*;


@Getter
@Setter
@AllArgsConstructor
@Builder
@NoArgsConstructor

@Document(collection = "users")

public class UserModel {
    private String id;
    private String nome;
    private String circuito;
    public void setId(ObjectId objectId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setId'");
    }
}
