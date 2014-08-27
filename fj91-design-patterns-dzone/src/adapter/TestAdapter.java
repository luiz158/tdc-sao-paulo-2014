package adapter;

import java.util.List;

public class TestAdapter {

	public static void main(String[] args) {
		Integer[] numbers = new Integer[]{1, 2, 6, 4, 9, 3};
		
		Sorter sorter = new SortListAdapter();
		List<Integer> sortedNumbers = sorter.sort(numbers);
		
		System.out.println(sortedNumbers);
	}
	
}
