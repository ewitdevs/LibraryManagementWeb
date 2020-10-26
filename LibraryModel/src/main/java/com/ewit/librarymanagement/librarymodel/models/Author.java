package com.ewit.librarymanagement.librarymodel.models;

import lombok.*;
import lombok.experimental.FieldNameConstants;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Table(name = "authors")
@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@NoArgsConstructor
public class Author extends BaseModel{
    private String name;

    @ManyToMany(mappedBy = "authors", fetch = FetchType.LAZY, cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE
    })
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    @FieldNameConstants.Exclude
    private Set<Book> books;

    public Author(LocalDateTime createdAt, LocalDateTime updatedAt, String name) {
        super(createdAt, updatedAt);
        this.name = name;
    }

    public Author(Long id, LocalDateTime createdAt, LocalDateTime updatedAt, String name) {
        super(id, createdAt, updatedAt);
        this.name = name;
    }
}
