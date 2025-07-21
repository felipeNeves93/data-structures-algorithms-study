package com.datastructuresalgorithmsstudy.arrays.maximumsubarraysum;

public class MaximumSubArraySolution {

  public int maxSubArray(int[] nums) {

    int largestSum = nums[0];
    int currentSum = nums[0];

    for (int i = 1; i < nums.length; i++) {
      if (currentSum < 0) {
        currentSum = 0;
      }

      currentSum += nums[i];

      if (currentSum > largestSum) {
        largestSum = currentSum;
      }
    }

    return largestSum;


  }

}
