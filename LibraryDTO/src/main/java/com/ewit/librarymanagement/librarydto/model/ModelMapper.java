package com.ewit.librarymanagement.librarydto.model;

import java.io.Serializable;

public interface ModelMapper<T,M> extends Serializable {
    M toModel();
}
