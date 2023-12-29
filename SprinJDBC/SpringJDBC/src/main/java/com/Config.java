package com;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@PropertySource(value = "app.properties")
@ComponentScan(basePackages = "com")
public class Config {
	@Bean
	public DataSource getDataSource() {
		DriverManagerDataSource ds=new DriverManagerDataSource();
		ds.setUrl("jdbc:mysql://127.0.0.1:3306/decemberspringjdbc");
		ds.setUsername("root");
		ds.setPassword("password");
		return ds;
	}
	@Bean
	public JdbcTemplate getJdbceTemplate() {
		DataSource dataSource = getDataSource();
		JdbcTemplate js=new JdbcTemplate(dataSource);
		return js;
	}
}
