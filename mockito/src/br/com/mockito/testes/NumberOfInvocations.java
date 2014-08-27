package br.com.mockito.testes;

import static org.mockito.Mockito.atLeastOnce;
import static org.mockito.Mockito.atMost;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import java.util.LinkedList;

import org.junit.Test;

public class NumberOfInvocations {

	@SuppressWarnings({"rawtypes", "unchecked"})
	@Test
	public void test_number_of_invocations() throws Exception {
		LinkedList mockedList = mock(LinkedList.class);
		
		mockedList.add("once");
		
		mockedList.add("twice");
		mockedList.add("twice");
		
		mockedList.add("three times");
		mockedList.add("three times");
		mockedList.add("three times");

		//following two verifications work exactly the same - times(1) is used by default
		verify(mockedList).add("once");
		verify(mockedList, times(1)).add("once");
		
		verify(mockedList, times(2)).add("twice");
		verify(mockedList, times(3)).add("three times");
		
		//never is an alias for times(0)
		verify(mockedList, never()).add("four times");
		
		verify(mockedList, atLeastOnce()).add("three times");
		
		verify(mockedList, atMost(3)).add("three times");
	}
	
}
