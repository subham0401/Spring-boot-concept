package com.subham.SpringConcept;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringConceptApplication {

	public static void main(String[] args) {
		/*ApplicationContext this is the return of run method  and by this object we can obtain the required bean id found*/
		ApplicationContext context = SpringApplication.run(SpringConceptApplication.class, args);
		Dev obj=(Dev)context.getBean(Dev.class);
		obj.callLaptop();

	}

}
