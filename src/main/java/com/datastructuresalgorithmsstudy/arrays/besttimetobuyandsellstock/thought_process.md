# Best Time to Buy and Sell Stock - Thought Process

## Problem Understanding
The problem requires finding the maximum profit that can be achieved by buying and selling a stock once. We're given an array where each element represents the stock's price on that day. We need to find the maximum difference between two numbers in the array where the smaller number comes before the larger number.

## Intuition
The key insight is that we want to buy at the lowest possible price and sell at the highest possible price that comes after the buying price. The challenge is to do this efficiently in a single pass through the array.

## Algorithm: One Pass Approach
This solution implements an efficient one-pass algorithm with O(n) time complexity and O(1) space complexity.

### How It Works
1. **Initialization**: 
   - Start with `maxProfit` set to 0 (minimum possible profit)
   - Set `buy` to the first price in the array (potential buying point)

2. **Iteration**:
   - For each subsequent price in the array:
     - Calculate the potential profit if we sell at the current price
     - Update `maxProfit` if this potential profit is greater than the current `maxProfit`
     - Update `buy` to be the minimum of the current `buy` price and the current price
     
     This ensures we always have the lowest buying price seen so far, which maximizes potential future profits.

3. **Termination**:
   - After processing all prices, `maxProfit` will contain the maximum possible profit (or 0 if no profit is possible)

## Why It Works
- The algorithm tracks the lowest price seen so far (`buy`)
- For each subsequent price, it calculates what the profit would be if we sold at that price after buying at the lowest price seen so far
- By always keeping track of the minimum price seen, we ensure we have the best possible buying opportunity for any selling point
- The maximum of all these potential profits gives us the optimal solution

## Time and Space Complexity
- **Time Complexity**: O(n) - We only make one pass through the array, performing constant time operations at each step.
- **Space Complexity**: O(1) - We only use a constant amount of extra space to store `maxProfit` and `buy`, regardless of the input size.

## Edge Cases Handled
1. **Single Price**: Returns 0 (can't buy and sell on the same day)
2. **Always Decreasing Prices**: Returns 0 (no profit possible)
3. **Always Increasing Prices**: Returns the difference between last and first price
4. **Multiple Local Minima/Maxima**: Correctly finds the global maximum profit

## Example Walkthrough
For array `[7, 1, 5, 3, 6, 4]`:
1. Initialize: maxProfit = 0, buy = 7
2. i=1 (1): 
   - profit = 1-7 = -6, maxProfit remains 0
   - buy = min(7,1) = 1
3. i=2 (5):
   - profit = 5-1 = 4, maxProfit = 4
   - buy remains 1
4. i=3 (3):
   - profit = 3-1 = 2, maxProfit remains 4
   - buy remains 1
5. i=4 (6):
   - profit = 6-1 = 5, maxProfit = 5
   - buy remains 1
6. i=5 (4):
   - profit = 4-1 = 3, maxProfit remains 5
   - buy remains 1
Final result: 5 (buy at 1, sell at 6)

## Optimization Notes
- The algorithm is already optimal with O(n) time and O(1) space
- It makes exactly n-1 comparisons (where n is the length of the prices array)
- No additional data structures are needed beyond simple variables
- The solution handles all edge cases correctly, including when no profit is possible
