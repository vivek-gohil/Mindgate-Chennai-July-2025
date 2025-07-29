package com.mindgate.main.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan("com.mindgate.main")
public class SpringConfiguration {

	private String user = "mindgate_chennai";
	private String password = "mindgate_chennai";
	private String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private String driver = "oracle.jdbc.driver.OracleDriver";

	@Bean
	public JdbcTemplate getJdbcTemplate() {
		System.out.println("getJdbcTemplate()");
		DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
		driverManagerDataSource.setUsername(user);
		driverManagerDataSource.setPassword(password);
		driverManagerDataSource.setUrl(url);
		driverManagerDataSource.setDriverClassName(driver);

		JdbcTemplate jdbcTemplate = new JdbcTemplate(driverManagerDataSource);
		return jdbcTemplate;

	}
}
