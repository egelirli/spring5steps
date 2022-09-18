package com.egelirli.spring.in28minutes.spring5steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.egelirli.spring.in28minutes.spring5steps.cdi.SomeCdiBusiness;
import com.egelirli.spring.in28minutes.spring5steps.xml.XmlPersonDAO;


@Configuration
@ComponentScan
public class SpringIn5StepsXmlContentApplication {

	private static Logger LOGGER = 
			LoggerFactory.getLogger(SpringIn5StepsXmlContentApplication.class);

	public static void main(String[] args) {

        try (ClassPathXmlApplicationContext applicationContext =
        		new ClassPathXmlApplicationContext("applContext.xml") ){
    		 
 				   
		 		XmlPersonDAO xmlPErsonDao = 
		 				applicationContext.getBean(XmlPersonDAO.class);
		 		
		 		
		 		LOGGER.info("{} jdbc: {}",xmlPErsonDao, xmlPErsonDao.getJdbcConnection());
        	
        }

	}
}