"""
Applicable only for sorted array

"""


def binary_search_recursive(arr, element, low, high):
    mid = (low + high) // 2

    if low <= high:
        # base case
        if arr[mid] == element:
            return mid

        # search right arr
        if element > arr[mid]:
            return binary_search_recursive(arr, element, mid + 1, high)

        # search left arr
        else:
            return binary_search_recursive(arr, element, low, mid - 1)

    return -1


def binary_search_iterative(arr, element):
    low = 0
    high = len(arr) - 1

    while low <= high:
        mid = (low + high) // 2
        if element == arr[mid]:
            return mid
        if element > arr[mid]:
            low = mid + 1
        else:
            high = mid - 1

    return -1


arr = [1, 2, 3, 4, 5]
element = 6

print(binary_search_recursive(arr, element, 0, len(arr) - 1))
print(binary_search_iterative(arr, element))
