package com.ewit.librarymanagement.librarymodel.models;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "book_quantity_lent")
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class BookQuantityLent extends BaseModel {

    @Enumerated(EnumType.STRING)
    @Column(name = "return_condition")
    private BookCondition returnCondition;

    @Column(name = "return_date")
    private LocalDate returnDate;

    @Column(name = "is_returned")
    private boolean isReturned;

    @Lob
    @Column(columnDefinition = "CLOB")
    private String review;

}
