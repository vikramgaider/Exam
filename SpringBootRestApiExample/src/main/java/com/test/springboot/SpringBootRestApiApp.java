package com.test.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = { "com.test.springboot" }) // same as																	// combined
public class SpringBootRestApiApp {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootRestApiApp.class, args);
	}

	/*@Bean
	public EmbeddedServletContainerFactory servletContainer() {
		TomcatEmbeddedServletContainerFactory factory = new TomcatEmbeddedServletContainerFactory();
		factory.setPort(9000);
        factory.setSessionTimeout(10, TimeUnit.MINUTES);
		return factory;
	}*/

}
