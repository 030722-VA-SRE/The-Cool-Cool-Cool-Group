package com.revature;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;

import io.micrometer.core.instrument.MeterRegistry;
import io.micrometer.core.instrument.simple.SimpleMeterRegistry;


@SpringBootTest
class Project1ApplicationTests {

	@Test
	void contextLoads() {
	}
	 @Bean
	  public MeterRegistry registry() {
	    return new SimpleMeterRegistry();
	  }
}
