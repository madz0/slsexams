package madz0.slsexams.repeatednums;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RepeatedFinder {

	public List<Integer> getRepeatedNumbers(List<Integer> ints) {
		if(ints == null || ints.size() == 0) {
			throw new IllegalArgumentException("Integer list should not be null or empty");
		}
		Set<Integer> indicatormap = new HashSet<>();
		return ints.stream().filter(n->!indicatormap.add(n)).collect(Collectors.toList());
	}
}
