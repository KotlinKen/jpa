package com.pure.service;

import java.math.BigInteger;
import java.util.List;

import org.springframework.stereotype.Service;

import com.pure.model.Device;
import com.pure.repository.DeviceRepository;



@Service
public class DeviceService {
	private DeviceRepository deviceRepository;
	public DeviceService(DeviceRepository deviceRepository) {
		this.deviceRepository = deviceRepository;
	}
	
	public Device getDevice(BigInteger deviceId) throws Exception {
		return deviceRepository.findById(deviceId).orElseThrow(()->  
//			new RestException(HttpStatus.Not_Found, "Not Found Device")
			new Exception("test"));
	}

	public List<Device> getDevices() {
		return deviceRepository.findAll();
	}
	
	
	
	
	
	
	
}
