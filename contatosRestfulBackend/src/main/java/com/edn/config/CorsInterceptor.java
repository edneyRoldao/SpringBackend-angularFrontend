package com.edn.config;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

/**
 * This project is a simple academic example, so I'm using this interceptor
 * to avoid the same origin policy applied by most browsers.
 * I think that although I'm using this interceptor, the HTTP verbs POST and PUT doesn't work on google, Then we need to use firefox.
 * 
 * @author eroldao
 *
 */
public class CorsInterceptor extends HandlerInterceptorAdapter {

	 public static final String CREDENTIALS_NAME = "Access-Control-Allow-Credentials";
	 public static final String ORIGIN_NAME = "Access-Control-Allow-Origin";
	 public static final String METHODS_NAME = "Access-Control-Allow-Methods";
	 public static final String HEADERS_NAME = "Access-Control-Allow-Headers";
	 public static final String MAX_AGE_NAME = "Access-Control-Max-Age";

	 @Override
	 public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		 response.setHeader(CREDENTIALS_NAME, "true");
		 response.setHeader(ORIGIN_NAME, "*");
		 response.setHeader(METHODS_NAME, "GET, OPTIONS, POST, PUT, DELETE");
		 response.setHeader(HEADERS_NAME, "Origin, X-Requested-With, Content-Type, Accept");
		 response.setHeader(MAX_AGE_NAME, "3600");

		 return true;
	 }
	
}
