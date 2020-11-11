package com.ewit.librarymanagement.librarymodel.models;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;

@Entity
@Table(name = "book_quantities")
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@SuperBuilder
public class BookQuantity extends BaseModel {

    @Column(name = "book_isbn")
    private String bookIsbn;

    @Column(name = "access_code")
    private String accessCode;

    @Enumerated(EnumType.STRING)
    @Column(name = "book_condition")
    private BookCondition bookCondition;

    @Enumerated(EnumType.STRING)
    @Column(name = "book_status")
    private BookStatus bookStatus;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "book_id")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Book book;

    @OneToOne(mappedBy = "bookQuantity")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private BookQuantityLent bookQuantityLent;

}
