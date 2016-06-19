package com.satish.resteasy.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.satish.resteasy.adapter.PrintAdapter;

@Configuration
@ComponentScan(basePackages="com.satish.resteasy")
public class resteasyconfig {

	@Bean
	public PrintAdapter printAdapter() {
		return new PrintAdapter();
	}
}
