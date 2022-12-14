package com.egelirli.spring.in28minutes.spring5steps.basic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class BinarySearchImpl {
	
	Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	@Qualifier("quick")
	private SortAlgorithm sortAlgorithm;
	
	public int binarySearch(int[] numbers, int numberToSearchFor) {

		int[] sortedNumbers = sortAlgorithm.sort(numbers);
		System.out.println(sortAlgorithm);// Search the array
		return 3;
	}

	//@PostConstruct
	public void postConstruct() {
		logger.info("In postConstruct");
	}
	
	//@PreDestroy
	public void preDestroy() {
		logger.info("In preDestroy");
	}
}
