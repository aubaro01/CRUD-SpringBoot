package com.crudspring.crud_spring.Adapter.Mapper;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.mapstruct.ReportingPolicy;
import java.util.List;
import com.crudspring.crud_spring.Adapter.dto.Response.UserServiceResponse;
import com.crudspring.crud_spring.core.Model.UserModel;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface UserMapper {
    List<UserServiceResponse> modelsToServiceResponses(List<UserModel> list);
    UserModel responseToModel (UserServiceResponse serviceResponse);
    UserServiceResponse modelToResponse(UserModel userModel);
}
