"""
Brute force: o(n2); o(1)
Hashing (target - nums[i]): o(n); o(n)
Sort -> Two Pointer:  O(N) + O(N*logN) ; o(1)
"""

from typing import List


class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        hm = dict()  # num: index
        for i in range(len(nums)):
            diff = target - nums[i]
            if diff in hm.keys():
                return [hm[diff], i]
            hm[nums[i]] = i


if __name__ == "__main__":
    sc = Solution()
    res = sc.twoSum([2, 7, 11, 15], 9)
    print(res)
