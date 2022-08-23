package com.tectoro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("package com.tectoro")
public class SimpleloginpageApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimpleloginpageApplication.class, args);
	}

}
