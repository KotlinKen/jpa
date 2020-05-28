package com.pure.repository;

import java.math.BigInteger;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pure.model.Device;

public interface DeviceRepository extends JpaRepository<Device, BigInteger> {

}
