package com.pure.configuration.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
@ConfigurationProperties("primary.datasource")
public class DataSourceProperties {
	private String id;
	private String password;
	private String className;
	private String url;
	private int min;
	private int max;
}
