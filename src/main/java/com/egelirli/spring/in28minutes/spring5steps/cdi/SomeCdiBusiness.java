package com.egelirli.spring.in28minutes.spring5steps.cdi;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//@Named
@Service
public class SomeCdiBusiness {

	@Autowired
	//@Inject
	private SomeCdiDAO someCdiDAO;

	public SomeCdiDAO getSomeCdiDAO() {
		return someCdiDAO;
	}

	public void setSomeCdiDAO(SomeCdiDAO someCdiDAO) {
		this.someCdiDAO = someCdiDAO;
	}
	
	public int findGreatest() {
		int max = Integer.MIN_VALUE;
		int[] data = someCdiDAO.getData();
		for(int i : data ) {
			if(i > max) {
				max = i;
			}
		}
		
		return max;
	}
}
