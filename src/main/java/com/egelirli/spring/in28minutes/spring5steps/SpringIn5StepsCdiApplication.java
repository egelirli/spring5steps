package com.egelirli.spring.in28minutes.spring5steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.egelirli.spring.in28minutes.spring5steps.cdi.SomeCdiBusiness;


@Configuration
@ComponentScan
public class SpringIn5StepsCdiApplication {

	private static Logger LOGGER = 
			LoggerFactory.getLogger(SpringIn5StepsCdiApplication.class);

	public static void main(String[] args) {

		// BinarySearchImpl binarySearch =
		// new BinarySearchImpl(new QuickSortAlgorithm());
		// Application Context
		try (AnnotationConfigApplicationContext  applicationContext = 
				   new AnnotationConfigApplicationContext(SpringIn5StepsCdiApplication.class)){
			
					//SpringApplicatio.run(SpringIn5StepsCdiApplication.class, args);
			
			SomeCdiBusiness business = 
					applicationContext.getBean(SomeCdiBusiness.class);
			
			
			LOGGER.info("{} dao: {}",business, business.getSomeCdiDAO());
		}

	}
}