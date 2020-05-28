package com.pure.model;

import java.math.BigInteger;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="Device")
public class Device {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private BigInteger deviceId;
	
	@Column(length= 100)
	private String deviceType;
	
	@Column(length= 400)
	private String fingerprint;
	
	@Column(length= 400)
	private String physical;
	
	
	
	
	
	
	
}
