package com.egelirli.spring.in28minutes.spring5steps.basic;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.egelirli.spring.in28minutes.spring5steps.SpringIn5StepsBasicApplication;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes=SpringIn5StepsBasicApplication.class)
public class BinarySearchTest {

	@Autowired
	BinarySearchImpl binarySearchImp;
	
	@Test
	public void testBasicScneario() {
		 
		int actualResult  =  binarySearchImp.binarySearch(new int[]{}, 5);
		assertEquals(3, actualResult);
	}

}
