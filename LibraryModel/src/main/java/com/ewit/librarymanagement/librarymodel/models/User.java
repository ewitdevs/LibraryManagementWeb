package com.ewit.librarymanagement.librarymodel.models;

import lombok.*;

import javax.persistence.*;

@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@Entity
@Table(name = "users")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User extends BaseModel{

    @Column(name="name")
    private String name;
    private String password;
    @Enumerated(EnumType.STRING)
    private UserType type;
    private boolean canLogin = false;
    private String usnOrId;
    @Enumerated(EnumType.STRING)
    private CourseYear year;
    private int allowedBooks;

}
