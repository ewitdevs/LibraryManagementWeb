package com.ewit.librarymanagement.librarymodel.models;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "devices")
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@AllArgsConstructor
@SuperBuilder
public class RefreshToken extends BaseModel{

    private String token;
    private Instant createDate;

}
