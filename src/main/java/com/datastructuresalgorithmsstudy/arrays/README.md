# Array Data Structure

## Definition
An array is a linear data structure that stores a collection of elements of the same type in contiguous memory locations. Each element is accessible via an index, typically starting from 0, allowing for efficient retrieval and modification.

## Main Concepts

### 1. **Fixed Size**
- Arrays in Java have a fixed size that is set at initialization and cannot be changed.
- Example: `int[] arr = new int[5];` creates an array of 5 integers.

### 2. **Indexing**
- Elements are accessed using a zero-based index.
- Example: In an array `arr`, the first element is `arr[0]`, the second is `arr[1]`, and so on.

### 3. **Contiguous Memory**
- Arrays store elements in adjacent memory locations, enabling fast access through pointer arithmetic.
- Time complexity for accessing an element: O(1).

### 4. **Homogeneous Elements**
- All elements in a Java array must be of the same data type (e.g., all `int`, all `String`).

### 5. **Operations**
- **Access**: Retrieve an element by its index (O(1)).
- **Insertion/Deletion**: Not directly supported in Java arrays due to fixed size; requires creating a new array or shifting elements manually (O(n) for shifting).
- **Traversal**: Iterating through elements is O(n).
- **Search**: Linear search is O(n); binary search (on sorted arrays) is O(log n).

### 6. **Advantages**
- Fast access to elements via index.
- Memory-efficient due to contiguous storage.
- Simple to implement and use for basic operations.

### 7. **Limitations**
- Fixed size limits flexibility; resizing requires creating a new array.
- Insertion and deletion in the middle are inefficient due to element shifting.
- Wasted memory if the array is not fully utilized.

### 8. **Use Cases**
- Storing lists of items (e.g., numbers, strings).
- Implementing other data structures like stacks, queues, or matrices.
- Efficient for scenarios requiring frequent element access by index.

### 9. **Example**
In Java:
```java
public class ArrayExample {
    public static void main(String[] args) {
        // Creating an array
        int[] arr = new int[4];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;

        // Accessing an element
        System.out.println(arr[1]); // Output: 20

        // Modifying an element
        arr[2] = 50;
        System.out.println(java.util.Arrays.toString(arr)); // Output: [10, 20, 50, 40]
    }
}
```