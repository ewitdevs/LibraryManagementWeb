package com.ewit.librarymanagement.librarydto.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookDTO {

    private Long id;
    private String title;
    private Long noOfBooks;

}
