package br.com.mockito.testes;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.LinkedList;

import org.junit.Test;

public class SomeStubbing {

	@SuppressWarnings({"rawtypes"})
	@Test
	public void test_some_stubbing() throws Exception {
		//We can mock real classes 
		LinkedList mockedList = mock(LinkedList.class);
		
		//Stubbing
		when(mockedList.get(0)).thenReturn("My Value");
		when(mockedList.get(1)).thenThrow(new RuntimeException());
		
		System.out.println(mockedList.get(0));

		//Verifying
		verify(mockedList).get(0);
	}
	
}
