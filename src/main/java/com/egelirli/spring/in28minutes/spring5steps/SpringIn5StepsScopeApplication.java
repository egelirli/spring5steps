package com.egelirli.spring.in28minutes.spring5steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.egelirli.spring.in28minutes.spring5steps.scope.PersonDAO;


@SpringBootApplication
public class SpringIn5StepsScopeApplication {

	private static Logger LOGGER = 
			LoggerFactory.getLogger(SpringIn5StepsScopeApplication.class);

	public static void main(String[] args) {

		// BinarySearchImpl binarySearch =
		// new BinarySearchImpl(new QuickSortAlgorithm());
		// Application Context
		ApplicationContext applicationContext = 
				SpringApplication.run(SpringIn5StepsScopeApplication.class, args);
		PersonDAO personDAO = 
				applicationContext.getBean(PersonDAO.class);
		
		PersonDAO personDAO2 = 
				applicationContext.getBean(PersonDAO.class);
		
		LOGGER.info("{}",personDAO);
		LOGGER.info("{}",personDAO.getJdbcConnection());
		
		LOGGER.info("{}",personDAO2);
		LOGGER.info("{}",personDAO2.getJdbcConnection());

	}
}