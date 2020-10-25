package com.ewit.librarymanagement.librarymodel.models;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "books_lend")
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
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
    @Column(columnDefinition = "CLOB")
    private String review;

    @Column(name = "is_completely_returned")
    private boolean isCompletelyReturned;
}
