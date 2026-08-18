"""
- First element is always sorted
- Keep inserting the element in the right index from the unsorted list

T: O(n^2) (Best case: O(1))
S: 1
"""


def sort(arr):
    n = len(arr)
    for i in range(1, n):
        key = arr[i]
        j = i - 1
        # Move elements of arr[0..i-1], that are greater than key, to one position ahead of their current position
        while j >= 0 and key < arr[j]:
            arr[j + 1] = arr[j]
            j -= 1
        arr[j + 1] = key
    return arr


print(sort([3, 1, 4, 5, 2]))
