package com.egelirli.spring.in28minutes.spring5steps.cdi;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class SomeCdiBusinessTest {

	@InjectMocks
	SomeCdiBusiness business;
	
	@Mock
	SomeCdiDAO someCdiDAO;
	
	@Test
	public void testBasicScneario() {
		when(someCdiDAO.getData()).thenReturn(new int[] {13,34,17});
		assertEquals(34, business.findGreatest());
	}
	
	@Test
	public void testBasicScneario_NoElements() {
		when(someCdiDAO.getData()).thenReturn(new int[] {});
		assertEquals(Integer.MIN_VALUE, business.findGreatest());
	}

	@Test
	public void testBasicScneario_() {
		when(someCdiDAO.getData()).thenReturn(new int[] {2,2});
		assertEquals(2, business.findGreatest());
	}
	
}
