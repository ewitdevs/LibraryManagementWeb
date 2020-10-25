package com.ewit.librarymanagement.librarymodel.models;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "authors")
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class Author extends BaseModel{
    private String name;
}
