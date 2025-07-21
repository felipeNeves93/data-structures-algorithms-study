package com.datastructuresalgorithmsstudy.arrays.maximumsubarraysum;

import org.junit.jupiter.api.Test;

class MaximumSubArraySolutionTests {

  private MaximumSubArraySolution solution = new MaximumSubArraySolution();

  //  Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
//  Output: 6
//  Explanation: The subarray [4,-1,2,1] has the largest sum 6.
  @Test
  void testExample1() {
    var nums = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};
    var expectedOutput = 6;

    var output = solution.maxSubArray(nums);

    assert output == expectedOutput;
  }

  //  Example 2:
  //
  //  Input: nums = [1]
  //  Output: 1
  //  Explanation: The subarray [1] has the largest sum 1.
  @Test
  void testExample2() {
    var nums = new int[]{1};
    var expectedOutput = 1;

    var output = solution.maxSubArray(nums);

    assert output == expectedOutput;
  }

  //  Example 3:
  //
  //  Input: nums = [5,4,-1,7,8]
  //  Output: 23
  //  Explanation: The subarray [5,4,-1,7,8] has the largest sum 23.

  @Test
  void testExample3() {
    var nums = new int[]{5, 4, -1, 7, 8};
    var expectedOutput = 23;

    var output = solution.maxSubArray(nums);

    assert output == expectedOutput;
  }
}
