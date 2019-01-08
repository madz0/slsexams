package madz0.slsexams.findsum;

import java.util.List;

public class SumOfTwoFinder {

	public int[] findNandM(List<Integer> sortedNumbers, int x) {
		if (sortedNumbers == null || sortedNumbers.size() == 0) {
			throw new IllegalArgumentException("Number list should not be null or empty");
		}
		int nIndex = 0;
		int mIndex = sortedNumbers.size() - 1;
		while (nIndex < mIndex) {
			int sumResult = sortedNumbers.get(nIndex) + sortedNumbers.get(mIndex);
			if (sumResult == x) {
				return new int[] { sortedNumbers.get(nIndex), sortedNumbers.get(mIndex) };
			}
			if (sumResult < x) {
				nIndex++;
			} else {
				mIndex--;
			}
		}
		return null;
	}
}
