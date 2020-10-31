package com.ewit.librarymanagement.librarymodel.models;

import com.fasterxml.jackson.annotation.JsonFormat;

@JsonFormat(shape = JsonFormat.Shape.STRING)
public enum BookStatus {
    AVAILABLE,
    ISSUED,
    REISSUED
}
