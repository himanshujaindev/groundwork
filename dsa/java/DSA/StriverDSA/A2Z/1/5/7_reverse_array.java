
import java.util.Arrays;

class Solution {

    private static void revArr(int start, int end, int[] arr) {
        if (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            revArr(start + 1, end - 1, arr);
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};

        System.out.println(Arrays.toString(nums));
        revArr(0, nums.length - 1, nums);
        System.out.println(Arrays.toString(nums));
    }
}
