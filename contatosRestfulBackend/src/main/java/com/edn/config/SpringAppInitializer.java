package com.edn.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * As this is an web application written with Spring, we need register a Servlet, in this caso
 * we have SpringDispatcherServlet, here we must to add all configuration classes, normally
 * these classes has either the annotation @Configuration or @Component
 * 
 * Here we have registered JPA class configuration and WebConfigurations.
 * 
 * There is also the requestServletMapping.
 * 
 * @author eroldao
 *
 */
public class SpringAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class[] { SpringDataJpaConfig.class, SpringAppWebConfig.class };
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return null;
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] { "/" };
	}

}
