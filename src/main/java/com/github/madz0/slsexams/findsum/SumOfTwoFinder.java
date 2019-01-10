package com.github.madz0.slsexams.findsum;

import java.util.List;

public class SumOfTwoFinder {

  public int[] findNandM(List<Integer> sortedNumbers, int x) {
    if (sortedNumbers == null || sortedNumbers.size() == 0) {
      throw new IllegalArgumentException("Number list should not be null or empty");
    }
    int firstNumberIdx = 0;
    int secondNumberIdx = sortedNumbers.size() - 1;
    while (firstNumberIdx < secondNumberIdx) {
      int sumResult = sortedNumbers.get(firstNumberIdx) + sortedNumbers.get(secondNumberIdx);
      if (sumResult == x) {
        return new int[] { sortedNumbers.get(firstNumberIdx), sortedNumbers.get(secondNumberIdx) };
      }
      if (sumResult < x) {
        firstNumberIdx++;
      } else {
        secondNumberIdx--;
      }
    }
    return null;
  }
}
