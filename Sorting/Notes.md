************************1. Bubble Sort******************************

Concept: Repeatedly compare adjacent elements and swap if they are in the wrong order.

Logic: Largest element “bubbles” to the end in each pass.

Time Complexity:

Best: O(n) (already sorted)

Worst: O(n²)

Average: O(n²)

Space Complexity: O(1) (in-place)


***********************2. Selection Sort***************************

Concept: Select the minimum (or maximum) element and place it in the correct position.

Logic: Finds the smallest element in the unsorted portion and swaps it with the first unsorted element.

Time Complexity:

Best/Worst/Average: O(n²)

Space Complexity: O(1)


***********************3. Insertion Sort****************************

Concept: Builds the sorted array one element at a time by inserting elements at their correct position.

Logic: Pick an element and place it in the already sorted portion.

Time Complexity:

Best: O(n) (already sorted)

Worst/Average: O(n²)

Space Complexity: O(1)


***********************4. Merge Sort***********************

Concept: Divide and Conquer algorithm. Divides array into halves, sorts them, and merges.

Logic: Recursively divide until one element, then merge in sorted order.

Time Complexity: O(n log n)

Space Complexity: O(n) (due to temporary arrays)


**********************5. Quick Sort************************

Concept: Divide and Conquer. Picks a pivot and partitions array into smaller and larger elements.

Logic: Elements smaller than pivot go left; larger go right; recursively sort.

Time Complexity:

Best/Average: O(n log n)

Worst: O(n²) (pivot choice is bad)

Space Complexity: O(log n) (recursive stack)