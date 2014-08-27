package br.com.mockito.testes;

import static org.mockito.Mockito.inOrder;
import static org.mockito.Mockito.mock;

import java.util.List;

import org.junit.Test;
import org.mockito.InOrder;

public class VerificationInOrder {

	@SuppressWarnings({"rawtypes", "unchecked"})
	@Test
	public void test_verification_in_order() throws Exception {
		//Single mock whose methods must be invoked in a particular order
		List mockedList = mock(List.class);
		
		mockedList.add("was added first");
		mockedList.add("was added second");
		
		InOrder inOrder = inOrder(mockedList);
		inOrder.verify(mockedList).add("was added first");
		inOrder.verify(mockedList).add("was added second");
		
		
	}
	
}
