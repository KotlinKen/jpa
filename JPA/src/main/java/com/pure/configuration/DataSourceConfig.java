package com.pure.configuration;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

import com.zaxxer.hikari.HikariDataSource;

@Configuration
public class DataSourceConfig {
	
	private Environment env;
	
	public DataSourceConfig(Environment env) {
		this.env = env;
	}

	@Bean
	public DataSource dataSource() {
		HikariDataSource hikariDataSource = new HikariDataSource();
//		dataSource.setUsername(env.getProperty(""));
		hikariDataSource.setDriverClassName("org.mariadb.jdbc.Driver");
		hikariDataSource.setJdbcUrl("jdbc:mariadb://localhost:3306/flutter?serverTimezone=Asia/Seoul");
		hikariDataSource.setUsername("hote");
		hikariDataSource.setPassword("ghxpfm");
		return hikariDataSource;
		
		
	}

}
