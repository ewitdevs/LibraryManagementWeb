package com.ewit.librarymanagement.librarymodel.models;

import lombok.*;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@Entity
@Table(name = "book_quantities")
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class BookQuantity extends BaseModel {
    private String isbn;
    @Column(name = "access_code", unique = true)
    private String accessCode;
    @Enumerated(EnumType.STRING)
    private BookCondition condition;
    @Enumerated(EnumType.STRING)
    private BookStatus status;
}
