package com.github.madz0.slsexams.findsum;

import org.junit.jupiter.api.Test;

import com.github.madz0.slsexams.findsum.SumOfTwoFinder;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

public class SumOfTwoFinderTest {

	private SumOfTwoFinder sumOfTwoFinder = new SumOfTwoFinder();
	
	@Test
	public void findNandMTest() {
		List<Integer> sortedNums = Arrays.asList(1, 3, 8, 12, 15, 17, 80, 145, 156);
		int x = 25;
		int[] result = sumOfTwoFinder.findNandM(sortedNums, x);
		assertNotNull(result);
		assertEquals(8, result[0]);
		assertEquals(17, result[1]);
	}
}
