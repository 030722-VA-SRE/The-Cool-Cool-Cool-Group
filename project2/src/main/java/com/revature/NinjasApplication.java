package com.revature;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.micrometer.core.aop.TimedAspect;
import io.micrometer.core.instrument.MeterRegistry;

@Configuration
@SpringBootApplication
public class NinjasApplication {

	public static void main(String[] args) {
		SpringApplication.run(NinjasApplication.class, args);
		
		//System.out.println("Hello World");
		 
	}
	@Bean
	public TimedAspect timedAspect(MeterRegistry registry) {
	   return new TimedAspect(registry);
	}
}
