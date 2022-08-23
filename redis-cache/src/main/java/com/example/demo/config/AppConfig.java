package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.web.servlet.tags.form.SelectTag;

@Configuration
public class AppConfig {
	
	@Bean
	public RedisConnectionFactory cf()
	{
		return new LettuceConnectionFactory();
	}

}
