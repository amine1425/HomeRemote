package com.home.remote.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.home.remote.api.entities.Device;

@Repository
public interface DeviceRepository extends JpaRepository<Device, Long> {

}
