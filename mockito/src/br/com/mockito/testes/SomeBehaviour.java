package br.com.mockito.testes;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import java.util.List;

import org.junit.Test;

public class SomeBehaviour {

	@SuppressWarnings({"unchecked", "rawtypes"})
	@Test
	public void test_add_list() throws Exception {
		List mockedList = mock(List.class);
		
		mockedList.add("My information");
		mockedList.clear();
		
		verify(mockedList).add("My information");
		verify(mockedList).clear();
	}
	
}
