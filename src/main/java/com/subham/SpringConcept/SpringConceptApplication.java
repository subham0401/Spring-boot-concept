package com.subham.SpringConcept;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication  // This annotation marks the class as a Spring Boot application
public class SpringConceptApplication {

	public static void main(String[] args) {
		/*
		 * SpringApplication.run() starts the Spring Boot application and
		 * returns an ApplicationContext object, which is a container for beans.
		 */
		ApplicationContext context = SpringApplication.run(SpringConceptApplication.class, args);

		/*
		 * The context.getBean() method is used to fetch the required bean (Dev class object).
		 * Spring automatically manages the object creation using Dependency Injection.
		 */
		Dev obj = (Dev) context.getBean(Dev.class);

		/*
		 * Calling the method on the Dev object.
		 * If there is an issue in wiring the beans, this call might fail.
		 */
		obj.callLaptop();
	}
}
