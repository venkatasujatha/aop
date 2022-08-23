package com.example.demo.config;

import org.springframework.cache.CacheManager;
import org.springframework.cache.ehcache.EhCacheCacheManager;
import org.springframework.cache.ehcache.EhCacheManagerFactoryBean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;

@Configuration
public class EhcacheConfiguration {
	
	CacheManager cacheManager()
	{
		return new EhCacheCacheManager(ehcacheManager());
	}

	private net.sf.ehcache.CacheManager ehcacheManager() {
		
		EhCacheManagerFactoryBean factoryBean=new EhCacheManagerFactoryBean();
		factoryBean.setConfigLocation(new ClassPathResource("ehcache.xml"));
		factoryBean.setShared(true);
		return factoryBean.getObject();
	}

}
