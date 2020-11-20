package com.ewit.librarymanagement.libraryrepository.repositories;

import com.ewit.librarymanagement.librarymodel.models.Device;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeviceRepository extends JpaRepository<Device, Long> {
}
