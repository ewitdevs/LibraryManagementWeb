package com.ewit.librarymanagement.librarydto.model;


import com.ewit.librarymanagement.librarymodel.models.CourseYear;
import com.ewit.librarymanagement.librarymodel.models.User;
import com.ewit.librarymanagement.librarymodel.models.UserType;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class UserDTO extends BaseDTO<UserDTO, User>{

    private static final long serialVersionUID = -8048910116952800303L;

    private String name;
    private String firstName;
    private String lastName;
    private UserType type;
    private boolean canLogin = false;
    private String usnOrId;
    private CourseYear year;
    private int allowedBooks;


    @Override
    public User toModel() {
        User user = new User();
        user.setId(getId());
        user.setName(name);
        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setType(type);
        user.setCanLogin(canLogin);
        user.setUsnOrId(usnOrId);
        user.setAllowedBooks(allowedBooks);
        user.setYear(year);
        user.setCreatedAt(getCreatedAt());
        user.setUpdatedAt(getUpdateAt());
        return user;
    }

    public static UserDTO fromModel(User user){
        UserDTO userDTO = new UserDTO();
        userDTO.setId(user.getId());
        userDTO.setFirstName(user.getFirstName());
        userDTO.setLastName(user.getLastName());
        userDTO.setType(user.getType());
        userDTO.setCanLogin(user.isCanLogin());
        userDTO.setUsnOrId(user.getUsnOrId());
        userDTO.setAllowedBooks(user.getAllowedBooks());
        userDTO.setYear(user.getYear());
        userDTO.setCreatedAt(user.getCreatedAt());
        userDTO.setUpdateAt(user.getUpdatedAt());
        return userDTO;
    }
}
