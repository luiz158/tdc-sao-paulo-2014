package br.com.mockito.testes;

import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.mock;

import java.util.LinkedList;

import org.junit.Test;

public class VoidWithExceptions {

	@SuppressWarnings({"rawtypes"})
	@Test
	public void test_void_with_exceptions() throws Exception {
		LinkedList mockedList = mock(LinkedList.class);
		
		doThrow(new RuntimeException()).when(mockedList).clear();
		
		mockedList.clear();
	}
	
}
