package com.ewit.librarymanagement.librarydto.model;


import com.ewit.librarymanagement.librarymodel.models.CourseYear;
import com.ewit.librarymanagement.librarymodel.models.User;
import com.ewit.librarymanagement.librarymodel.models.UserType;
import lombok.*;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO implements Serializable {

    private static final long serialVersionUID = -8048910116952800303L;

    private Long id;
    private String name;
    private String firstName;
    private String lastName;
    private UserType type;
    private String usnOrId;
    private CourseYear year;
    private int allowedBooks;

}
