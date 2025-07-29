package com.mindgate.main.configruation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
public class SpringConfiguration {

	public SpringConfiguration() {
		System.out.println("SpringConfiguration object created");
	}

	@Bean
	ViewResolver getViewResolver() {
		System.out.println("in getViewResolver()");
		return new InternalResourceViewResolver("/WEB-INF/view/", ".jsp");
	}
}
