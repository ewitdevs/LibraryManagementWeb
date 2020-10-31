package com.ewit.librarymanagement.librarymodel.models;

import com.fasterxml.jackson.annotation.JsonFormat;

@JsonFormat(shape = JsonFormat.Shape.STRING)
public enum BookCondition {
    NEW,
    RENEWED,
    PARTIALLY_DAMAGED,
    COMPLETELY_DAMAGED
}
