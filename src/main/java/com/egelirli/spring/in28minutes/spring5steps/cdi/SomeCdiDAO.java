package com.egelirli.spring.in28minutes.spring5steps.cdi;

import javax.inject.Named;

import org.springframework.stereotype.Component;

//@Component
@Named
public class SomeCdiDAO {
	
	public int[] getData() {
		  return new int[] {5,89,100};
	}

}
