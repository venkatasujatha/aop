package beanconfiguration1;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.tectoro.beanConfiguration1")
public class AppConfig {
	
	/*
	 * @Bean public Samsung getPhone() { return new Samsung(); }
	 * 
	 * @Bean public MobileProcessor getProcess() { return new snapDragon();
	 * 
	 * }
	 */

}
