package com.crudspring.crud_spring.Adapter.Controller;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class ResponseEnvelope<T> {
    private T content;
}
