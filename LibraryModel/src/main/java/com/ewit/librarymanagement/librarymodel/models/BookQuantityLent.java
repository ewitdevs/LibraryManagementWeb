package com.ewit.librarymanagement.librarymodel.models;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "book_quantity_lents")
@Getter
@Setter
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
    private String review;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    @MapsId
    private BookQuantity bookQuantity;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "book_lend_id")
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private BookLend bookLend;

}
