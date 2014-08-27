package br.com.mockito.testes;

import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.LinkedList;

import org.junit.Test;

public class ArgumentMatcher {

	@SuppressWarnings({"rawtypes"})
	@Test
	public void test_argument_matcher() throws Exception {
		LinkedList mockedList = mock(LinkedList.class);
		
		when(mockedList.get(anyInt())).thenReturn("My value");
		
		System.out.println(mockedList.get(0));
	}
}
