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

    public void setId(String objectId) {
        throw new UnsupportedOperationException("Unimplemented method 'setId'");
    }

    public void setId(ObjectId objectId) {
        throw new UnsupportedOperationException("Unimplemented method 'setId'");
    }

}
