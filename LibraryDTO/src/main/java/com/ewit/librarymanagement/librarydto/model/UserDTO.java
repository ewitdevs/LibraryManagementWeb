package com.ewit.librarymanagement.librarydto.model;


import com.ewit.librarymanagement.librarymodel.models.CourseYear;
import com.ewit.librarymanagement.librarymodel.models.User;
import com.ewit.librarymanagement.librarymodel.models.UserType;
import lombok.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO implements Serializable {

    private static final long serialVersionUID = -8048910116952800303L;

    private Long id;
    @NotBlank(message = "Name is required")
    private String name;
    private String firstName;
    private String lastName;
    @NotNull(message = "Type is required")
    private UserType type;
    @NotBlank(message = "USN or ID is required")
    private String usnOrId;
    @NotNull(message = "Course Year is required")
    private CourseYear year;
    private int allowedBooks;

}
