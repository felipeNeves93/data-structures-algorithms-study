# Time and Space Complexity
Understanding the efficiency of algorithms is critical for writing optimized code. Below is an explanation of **time complexity** and **space complexity**, along with examples.

### Time Complexity
Time complexity measures the amount of time an algorithm takes to run as a function of the input size (`n`). It is typically expressed using **Big O notation**, which describes the worst-case scenario.

#### Common Time Complexities
- **O(1) - Constant Time**: The algorithm's runtime does not depend on input size.
    - *Example*: Accessing an element in an array by index.
- **O(log n) - Logarithmic Time**: The runtime grows logarithmically with input size, often seen in divide-and-conquer algorithms.
    - *Example*: Binary search on a sorted array.
- **O(n) - Linear Time**: The runtime grows linearly with input size.
    - *Example*: Iterating through an array to find an element.
- **O(n log n) - Linearithmic Time**: Common in efficient sorting algorithms.
    - *Example*: Merge Sort, Quick Sort (average case).
- **O(n²) - Quadratic Time**: The runtime grows quadratically, often due to nested loops.
    - *Example*: Bubble Sort, checking for duplicates in an unsorted array.
- **O(2ⁿ) - Exponential Time**: The runtime doubles with each additional input, often in recursive algorithms solving combinatorial problems.
    - *Example*: Solving the traveling salesman problem via brute force.

#### Example: Time Complexity Analysis
**Problem**: Find the maximum element in an array.
- **Code** (Python):
  ```python
  def find_max(arr):
      max_val = arr[0]
      for num in arr:
          if num > max_val:
              max_val = num
      return max_val
  ```
- **Analysis**:
    - Iterates through the array once, performing a constant-time comparison for each element.
    - **Time Complexity**: O(n), where `n` is the array length.
    - **Space Complexity**: O(1), as only a single variable (`max_val`) is used regardless of input size.

### Space Complexity
Space complexity measures the amount of memory an algorithm uses as a function of the input size (`n`). It includes both **auxiliary space** (extra space used by the algorithm) and **input space**.

#### Common Space Complexities
- **O(1) - Constant Space**: The algorithm uses a fixed amount of memory.
    - *Example*: In-place swapping of two variables.
- **O(n) - Linear Space**: The memory usage grows linearly with input size.
    - *Example*: Creating a new array to store a copy of the input.
- **O(n²) - Quadratic Space**: The memory usage grows quadratically, often in algorithms using 2D arrays.
    - *Example*: Creating a matrix for dynamic programming problems like the knapsack problem.
- **O(log n) - Logarithmic Space**: The memory usage grows logarithmically, often due to recursive call stacks.
    - *Example*: Recursive binary search.

#### Example: Space Complexity Analysis
**Problem**: Merge Sort an array.
- **Code Outline** (Python):
  ```python
  def merge_sort(arr):
      if len(arr) <= 1:
          return arr
      mid = len(arr) // 2
      left = merge_sort(arr[:mid])
      right = merge_sort(arr[mid:])
      return merge(left, right)
  ```
- **Analysis**:
    - **Time Complexity**: O(n log n), as the array is divided into two halves (log n levels), and merging takes O(n) per level.
    - **Space Complexity**: O(n), as the algorithm creates temporary arrays for the left and right halves during merging, and the recursive call stack uses O(log n) space.
