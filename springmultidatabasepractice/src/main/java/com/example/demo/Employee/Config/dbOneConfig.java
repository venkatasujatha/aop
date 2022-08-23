package com.example.demo.Employee.Config;
import java.util.HashMap;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@EnableAutoConfiguration
@EnableJpaRepositories(entityManagerFactoryRef = "db1EntityManagerFactory",transactionManagerRef = "db1transactionManager",
basePackages = "com.example.demo.Employee.Repository")
public class dbOneConfig {
	
	@Bean
	@ConfigurationProperties(prefix ="db1.datasource")
	public DataSource db1DataSource()
	{
		return DataSourceBuilder.create().build();
	}
	@Bean
	
	
	public LocalContainerEntityManagerFactoryBean db1EntityManagerFactory(EntityManagerFactoryBuilder builder2)
	{
		HashMap<String, Object> properties1=new HashMap<>();
		properties1.put("hibernate.hbm2ddl.auto","create");
		properties1.put("hibernate.dialect", "org.hibernate.dialect.PostgreSQLDialect");
		
		return builder2.dataSource(db1DataSource()).packages("com.example.demo.Model.Employee").properties(properties1).persistenceUnit("Employee").build();
				
				
	}
	
	@Bean
	
	
	public PlatformTransactionManager db1transactionManager(@Qualifier("db1EntityManagerFactory") EntityManagerFactory entityManagerFactory1)
	{
		return new JpaTransactionManager(entityManagerFactory1);
	}

}
