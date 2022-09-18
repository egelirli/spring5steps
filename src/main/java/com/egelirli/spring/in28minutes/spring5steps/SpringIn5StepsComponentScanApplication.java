package com.egelirli.spring.in28minutes.spring5steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.egelirli.spring.componentscan.ComponentDAO;
import com.egelirli.spring.in28minutes.spring5steps.scope.PersonDAO;


@SpringBootApplication
@ComponentScan("com.egelirli.spring.componentscan")
public class SpringIn5StepsComponentScanApplication {

	private static Logger LOGGER = 
			LoggerFactory.getLogger(SpringIn5StepsComponentScanApplication.class);

	public static void main(String[] args) {

		// BinarySearchImpl binarySearch =
		// new BinarySearchImpl(new QuickSortAlgorithm());
		// Application Context
		ApplicationContext applicationContext = 
				SpringApplication.run(SpringIn5StepsComponentScanApplication.class, args);
		ComponentDAO compDAO = 
				applicationContext.getBean(ComponentDAO.class);
		
		ComponentDAO personDAO2 = 
				applicationContext.getBean(ComponentDAO.class);
		
		LOGGER.info("{}",compDAO);
		LOGGER.info("{}",compDAO.getJdbcConnection());
		

	}
}