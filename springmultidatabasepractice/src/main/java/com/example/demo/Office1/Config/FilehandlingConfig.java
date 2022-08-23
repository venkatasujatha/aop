package com.example.demo.Office1.Config;

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
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@EnableAutoConfiguration
@EnableJpaRepositories(entityManagerFactoryRef = "entityManagerFactory",transactionManagerRef = "fileHandlingTransactionManager",
basePackages = "com.example.demo.Office.Repository")
public class FilehandlingConfig {
	
	@Bean
	@Primary
	@ConfigurationProperties(prefix ="filehandling.datasource")
	public DataSource fileHandlingDataSource()
	{
		return DataSourceBuilder.create().build();
	}
	@Bean
	@SuppressWarnings("unchecked")
	@Primary
	public LocalContainerEntityManagerFactoryBean entityManagerFactory(EntityManagerFactoryBuilder builder)
	{
		HashMap<String, Object> properties=new HashMap<>();
		properties.put("hibernate.hbm2ddl.auto","create");
		properties.put("hibernate.dialect", "org.hibernate.dialect.PostgreSQLDialect");
		
		
		return builder.dataSource(fileHandlingDataSource()).packages("com.example.demo.Model.Office").properties(properties).persistenceUnit("Office").build();
	}
	
	@Bean
	@SuppressWarnings("unchecked")
	@Primary
	public PlatformTransactionManager fileHandlingTransactionManager(@Qualifier("entityManagerFactory") EntityManagerFactory builder1)
	{
		return new JpaTransactionManager(builder1);
	}

}
