package com.datastructuresalgorithmsstudy.arrays.besttimetobuyandsellstock;

import org.junit.jupiter.api.Test;

public class BestTimeToBuyAndSellStockTest {

  private SolutionBestTimeToBuyAndSellStock solution = new SolutionBestTimeToBuyAndSellStock();

  //  Example 1:
  //
  //  Input: prices = [7,1,5,3,6,4]
  //  Output: 5
  //  Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
  //  Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
  @Test
  void testExample1() {
    var prices = new int[]{7, 1, 5, 3, 6, 4};
    var expectedOutput = 5;

    var output = solution.maxProfit(prices);

    assert output == expectedOutput;
  }

  //  Example 2:
  //
  //  Input: prices = [7,6,4,3,1]
  //  Output: 0
  //  Explanation: In this case, no transactions are done and the max profit = 0.
  @Test
  void testExample2() {
    var prices = new int[]{7, 6, 4, 3, 1};
    var expectedOutput = 0;

    var output = solution.maxProfit(prices);

    assert output == expectedOutput;
  }


}
