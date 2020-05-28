package com.pure.controller;

import java.math.BigInteger;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pure.model.Device;
import com.pure.service.DeviceService;

@RestController
public class DeviceController {

	private DeviceService deviceService;
	
	public DeviceController(DeviceService deviceService) {
		super();
		this.deviceService = deviceService;
	}

	@GetMapping(value = "/device")
	public Device getMethodName(@RequestParam(required=false) String param) throws Exception {
		 Device device = deviceService.getDevice(new BigInteger("10000"));
		 System.out.println("test");
		return device; 
	}
	
	@GetMapping(value = "/devices")
	public List<Device> getDevices() {
		return deviceService.getDevices();
	}

	
	@GetMapping(value = "/")
	public String test(@RequestParam(required=false) String param) {
		return "test"; 
	}

	
	
}
