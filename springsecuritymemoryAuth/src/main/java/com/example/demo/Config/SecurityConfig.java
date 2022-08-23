package com.example.demo.Config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
@EnableWebSecurity
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter{
	
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		
		//for immemory auth
		/*
		 * auth.inMemoryAuthentication().withUser("sujatha").password("{noop}sujatha").
		 * authorities("ADMIN");
		 * auth.inMemoryAuthentication().withUser("sami").password("{noop}sami").
		 * authorities("STUDENT");
		 * auth.inMemoryAuthentication().withUser("ram").password("{noop}ram").
		 * authorities("EMPLOYEE");
		 */
		
		//for jdbcAuthentication
		
		auth.jdbcAuthentication()
		.dataSource(null)
		.usersByUsernameQuery("")
		.authoritiesByUsernameQuery("")
		.passwordEncoder(null);
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		//which url-what access type
		//url-access type
		http.authorizeRequests()
		.antMatchers("/home").permitAll()
		.antMatchers("/welcome").authenticated()
		.antMatchers("/admin").hasAuthority("ADMIN")
		.antMatchers("/emp").hasAuthority("EMPLOYEE")
		.antMatchers("/std").hasAuthority("STUDENT")
		.antMatchers("/common").hasAnyAuthority("ADMIN","EMPLOYEE")
		
		//Login form details
		.and()
		.formLogin()
		.defaultSuccessUrl("/welcome",true)
		
		//logout details
		.and()
		.logout()
		.logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
		//exception details
		.and()
		.exceptionHandling()
		.accessDeniedPage("/denied");
			}

}
