package com.example.tomcat_deployment;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

 /**
  * The ServletInitializer class is used to configure the application when it is deployed to a servlet container like Tomcat.
  */
public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(TomcatDeploymentApplication.class);
	}

}
