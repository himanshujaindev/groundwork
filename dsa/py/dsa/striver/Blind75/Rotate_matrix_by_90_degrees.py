"""
Find the lowest num; Maximize the difference
o(n); o(1)
"""

from typing import List


class Solution:
    def rotate(self, matrix: List[List[int]]) -> None:
        print(f"Original matrix: {matrix}")

        # transpose of a matrix
        for i in range(len(matrix)):
            for j in range(i+1, len(matrix)):
                matrix[i][j], matrix[j][i] = matrix[j][i], matrix[i][j]

        # reverse row
        for i in range(len(matrix)):
            matrix[i] = matrix[i][::-1]

        print(f"90 degree rotated matrix: {matrix}")


if __name__ == "__main__":
    sc = Solution()
    res = sc.rotate([[1, 2, 3], [4, 5, 6], [7, 8, 9]])
