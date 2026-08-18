
class Solution {

    public int search(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            // System.out.println(low + " " + mid + " " + high);

            if (nums[mid] == target) {
                return mid;
            }

            // first half sorted
            if (nums[low] <= nums[mid]) {
                // target is in that sorted half
                if (nums[low] <= target && target <= nums[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else { // second half sorted
                if (nums[mid] <= target && target <= nums[high]) { // target is in that second half
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Solution sc = new Solution();
        System.out.println(sc.search(new int[]{4, 5, 6, 7, 0, 1, 2}, 0));
    }
}
