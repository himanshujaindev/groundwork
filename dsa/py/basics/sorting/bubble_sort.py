"""
Swap locally; Bubble / Move the largest element to the end

T: O(n^2)
S: O(1)
"""


def sort(arr):
    n = len(arr)

    for i in range(n - 1):
        for j in range(n - i - 1):
            if arr[j] > arr[j + 1]:
                # swap
                arr[j], arr[j + 1] = arr[j + 1], arr[j]
        print(f"partial sort -> {arr}")

    return arr


print(sort([3, 4, 1, 2, 5]))
