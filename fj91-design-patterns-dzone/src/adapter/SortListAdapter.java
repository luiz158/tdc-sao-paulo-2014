package adapter;

import java.util.Arrays;
import java.util.List;

public class SortListAdapter implements Sorter {

	@Override
	public List<Integer> sort(Integer[] numbers) {
		List<Integer> adaptedNumbers = Arrays.asList(numbers);
		
		NumberSorter sorter = new NumberSorter();
		
		return sorter.sort(adaptedNumbers);
	}

}
