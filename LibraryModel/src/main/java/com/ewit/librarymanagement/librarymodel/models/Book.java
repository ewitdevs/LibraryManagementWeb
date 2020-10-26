package com.ewit.librarymanagement.librarymodel.models;


import lombok.*;
import lombok.experimental.FieldNameConstants;
import org.springframework.beans.factory.annotation.Required;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "books")
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@NoArgsConstructor
public class Book extends BaseModel {

    @NonNull
    private String title;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinTable(name = "authors_books", joinColumns = {@JoinColumn(name = "book_id")}, inverseJoinColumns = {@JoinColumn(name = "author_id")})
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private Set<Author> authors;

    @OneToMany(mappedBy = "book")
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private List<BookQuantity> bookQuantities;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "category_id")
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private Category category;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "sub_category_id")
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private SubCategory subCategory;

}
