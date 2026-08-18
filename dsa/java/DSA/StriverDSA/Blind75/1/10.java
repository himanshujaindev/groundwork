
class Solution {

    /*
    Two pointers: 
    ans = height * length
        = min(arr[left], arr[right]) * (right - left)
    arr[left] < arr[right] -> left++
    o(n); o(1)
     */
    public int maxArea(int[] height) {
        int n = height.length;
        int left = 0, right = n - 1;
        int ans = 0;
        while (left < right) {
            int curArea = Integer.min(height[left], height[right]) * (right - left);
            // System.out.println(left + " " + right + " " + curArea);
            ans = Integer.max(ans, curArea);
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Solution sc = new Solution();
        System.out.println(sc.maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));
    }
}
