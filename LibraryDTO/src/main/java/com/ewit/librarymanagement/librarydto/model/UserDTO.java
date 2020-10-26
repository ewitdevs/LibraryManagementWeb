package com.ewit.librarydto.model;


import com.ewit.librarymanagement.librarymodel.models.User;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class UserDTO extends BaseDTO<UserDTO, User>{

    private static final long serialVersionUID = -8048910116952800303L;

    @Override
    public User toModel(UserDTO userDTO) {
        return null;
    }

    public static UserDTO fromModel(User user){
        return null;
    }
}
