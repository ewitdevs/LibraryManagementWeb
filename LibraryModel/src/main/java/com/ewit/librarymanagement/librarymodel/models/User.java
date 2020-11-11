package com.ewit.librarymanagement.librarymodel.models;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "users")
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@SuperBuilder
public class User extends BaseModel{

    @Column(name="name")
    private String name;
    private String password;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Enumerated(EnumType.STRING)
    private UserType type;
    private boolean canLogin = false;
    private String usnOrId;
    @Enumerated(EnumType.STRING)
    private CourseYear year;
    private int allowedBooks;

    @OneToMany(mappedBy = "issuer")
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private List<BookLend> issuedBooks;

    @OneToMany(mappedBy = "receiver")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private List<BookLend> receivedBooks;
}
