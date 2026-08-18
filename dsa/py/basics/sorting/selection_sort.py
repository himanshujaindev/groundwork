"""
Find the smallest element and swap with first element
Move to the next element

T: O(n^2)
S: 1
"""


def sort(arr):
    n = len(arr)
    for i in range(n):
        minIndex = i
        for j in range(i + 1, n):
            if arr[i] > arr[j]:
                minIndex = j

        # swap
        arr[i], arr[minIndex] = arr[minIndex], arr[i]
    return arr


arr = [3, 2, 4, 1, 5]
print(sort(arr))
