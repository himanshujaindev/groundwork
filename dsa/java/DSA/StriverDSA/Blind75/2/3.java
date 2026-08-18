
import java.util.Arrays;

class Solution {

    /*
    ans[i]=ans[i/2]+(i%2) OR ans[i]=ans[i>>1]+(i&1)
     */
    public int[] countBits(int n) {
        int[] ans = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            ans[i] = ans[i >> 1] + (i & 1);
        }
        return ans;
    }

    public static void main(String[] args) {
        Solution sc = new Solution();
        System.out.println(Arrays.toString(sc.countBits(5)));
    }
}
