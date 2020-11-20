package com.ewit.librarymanagement.librarymodel.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


@Getter
@Setter
@Entity
@Table(name = "devices")
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class Device extends BaseModel{

    @Column(name = "device_id")
    private String deviceId;

    @Column(name = "os_name")
    private String osName;

    @Column(name = "os_version")
    private String osVersion;

    @Column(name = "device_token")
    private String deviceToken;

}
