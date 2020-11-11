package com.ewit.librarymanagement.librarymodel.models;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "book_lends")
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@SuperBuilder
public class BookLend extends BaseModel {

    @Column(name = "lend_date")
    private LocalDate lendDate;

    @Column(name = "due_date")
    private LocalDate dueDate;

    @Column(name = "is_fine")
    private boolean isFine;

    @Column(name = "fine_amount")
    private BigDecimal fineAmount;

    @Column(name = "is_fine_collected")
    private boolean isFineCollected;

    @Lob
    private String review;

    @Column(name = "is_completely_returned")
    private boolean isCompletelyReturned;

    @OneToMany(mappedBy = "bookLend")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private List<BookQuantityLent> bookQuantityLents;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "issuer_id")
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private User issuer;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "receiver_id")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private User receiver;
}
