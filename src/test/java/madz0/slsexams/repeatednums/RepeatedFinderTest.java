package madz0.slsexams.repeatednums;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

public class RepeatedFinderTest {

	private RepeatedFinder repeatedFinder = new RepeatedFinder();
	@Test
	public void getRepeatedNumbersTest() {
		
		List<Integer> ints = Arrays.asList(1,5,4,7,9,8,3,6,8,2,3);
		List<Integer> result = repeatedFinder.getRepeatedNumbers(ints);
		assertTrue(result.contains(8));
		assertTrue(result.contains(3));
		assertTrue(!result.contains(1));
	}
}
