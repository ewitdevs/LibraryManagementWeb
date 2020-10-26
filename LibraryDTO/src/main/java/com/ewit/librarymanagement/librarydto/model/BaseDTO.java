package com.ewit.librarydto.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
public abstract class BaseDTO<T, M> implements Serializable {
    private Long id;
    private LocalDateTime createdAt;
    private LocalDateTime updateAt;

    public abstract M toModel(T t);
}
