package com.ewit.librarymanagement.librarydto.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PageRequestDTO<T> {

    private List<T> data;
    private Long pageNumber;
    private Long pageSize;
    private Long nodOfPages;
}
