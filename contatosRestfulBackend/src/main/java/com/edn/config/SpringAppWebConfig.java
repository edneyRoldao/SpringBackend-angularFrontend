package com.edn.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * The whole web configuration must be implemented in thi class.
 * 
 * Here we have: SpringData configuration
 * 
 * @author eroldao
 *
 */
@EnableWebMvc
@Configuration
@ComponentScan("com.edn")
@EnableJpaRepositories("com.edn.repository")
public class SpringAppWebConfig extends WebMvcConfigurerAdapter {
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(new CorsInterceptor());
	}
	
}
