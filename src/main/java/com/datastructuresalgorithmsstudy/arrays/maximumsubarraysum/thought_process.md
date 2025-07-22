# Maximum Subarray Sum - Thought Process

## Problem Understanding
The problem requires finding the contiguous subarray within a one-dimensional array of numbers which has the largest sum. For example, in the array `[-2,1,-3,4,-1,2,1,-5,4]`, the subarray `[4,-1,2,1]` has the largest sum of 6.

## Intuition
The key insight is that we can make a single pass through the array while keeping track of two things:
1. The maximum sum we've seen so far
2. The maximum sum of subarrays ending at the current position

## Algorithm: Kadane's Algorithm
This solution implements Kadane's Algorithm, which is an optimal solution for the maximum subarray problem with O(n) time complexity and O(1) space complexity.

### How It Works
1. **Initialization**: 
   - Start with `currentSum` and `largestSum` both set to the first element of the array.
   - This handles the base case where the array has only one element.

2. **Iteration**:
   - For each subsequent element in the array:
     - If `currentSum` is negative, reset it to 0. This is because a negative sum would only decrease the sum of the current subarray, so we're better off starting a new subarray from the current element.
     - Add the current element to `currentSum`.
     - Update `largestSum` if `currentSum` is greater.

3. **Termination**:
   - After processing all elements, `largestSum` will contain the maximum sum of any contiguous subarray.

## Why It Works
- The algorithm effectively breaks down the problem into smaller subproblems: "What is the maximum subarray sum ending at each position?"
- By keeping track of the maximum sum found so far, we ensure we don't need to store all possible subarray sums.
- The key insight is that if the sum of a subarray becomes negative, it's better to start a new subarray from the next element, as a negative sum would only decrease the sum of any future subarray it's part of.

## Time and Space Complexity
- **Time Complexity**: O(n) - We only make one pass through the array, performing constant time operations at each step.
- **Space Complexity**: O(1) - We only use a constant amount of extra space to store `currentSum` and `largestSum`, regardless of the input size.

## Edge Cases Handled
1. **Single Element Array**: Returns that single element.
2. **All Negative Numbers**: Correctly identifies the maximum (least negative) number.
3. **All Positive Numbers**: The entire array is the subarray with the maximum sum.
4. **Array with Zero**: Handles zeros appropriately, as they don't affect the sum but can be part of the maximum subarray.

## Example Walkthrough
For array `[-2,1,-3,4,-1,2,1,-5,4]`:
1. Initialize: currentSum = -2, largestSum = -2
2. i=1 (1): currentSum = max(-2,0) + 1 = 1, largestSum = 1
3. i=2 (-3): currentSum = 1 + (-3) = -2, largestSum remains 1
4. i=3 (4): currentSum = max(-2,0) + 4 = 4, largestSum = 4
5. i=4 (-1): currentSum = 4 + (-1) = 3, largestSum remains 4
6. i=5 (2): currentSum = 3 + 2 = 5, largestSum = 5
7. i=6 (1): currentSum = 5 + 1 = 6, largestSum = 6
8. i=7 (-5): currentSum = 6 + (-5) = 1, largestSum remains 6
9. i=8 (4): currentSum = 1 + 4 = 5, largestSum remains 6
Final result: 6
