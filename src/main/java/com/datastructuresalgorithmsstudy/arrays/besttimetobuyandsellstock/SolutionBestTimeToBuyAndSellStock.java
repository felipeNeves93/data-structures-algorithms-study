package com.datastructuresalgorithmsstudy.arrays.besttimetobuyandsellstock;

public class SolutionBestTimeToBuyAndSellStock {

  public int maxProfit(int[] prices) {
    int maxProfit = 0;
    int buy = prices[0];

    for (int i = 1; i < prices.length; i++) {
      int sell = prices[i];
      int profit = sell - buy;

      maxProfit = Math.max(maxProfit, profit);
      buy = Math.min(buy, sell);
    }

    return maxProfit;
  }

}
