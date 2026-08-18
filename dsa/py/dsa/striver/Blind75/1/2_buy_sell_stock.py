"""
Find the lowest num; Maximize the difference
o(n); o(1)
"""

from typing import List


class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        minPrice = prices[0]
        maxDiff = 0
        for i in range(1, len(prices)):
            if prices[i] < minPrice:
                minPrice = prices[i]
            diff = prices[i] - minPrice
            if diff > maxDiff:
                maxDiff = diff
        return maxDiff


if __name__ == "__main__":
    sc = Solution()
    res = sc.maxProfit([7, 1, 5, 3, 6, 4])
    print(res)
