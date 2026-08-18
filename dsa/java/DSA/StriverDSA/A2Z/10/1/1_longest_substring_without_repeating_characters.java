
import java.util.HashMap;
import java.util.Map;

class Solution {

    // // sliding window
    // public int lengthOfLongestSubstring(String s) {
    //     Map<Character, Integer> c;
    //     int res = 0;
    //     int count;
    //     for (int i = 0; i < s.length(); i++) {
    //         count = 0;
    //         c = new HashMap<>();
    //         for (int j = i; j < s.length(); j++) {
    //             if (!c.containsKey(s.charAt(j))) {
    //                 count += 1;
    //                 c.put(s.charAt(j), c.getOrDefault(s.charAt(j), 0) + 1);
    //                 if (res < count) {
    //                     res = count;
    //                 }
    //             } else {
    //                 break;
    //             }
    //         }
    //     }
    //     return res;
    // }
    /*
    sliding window
    Time complexity: O(n)
    Space complexity: O(n)
     */
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> c = new HashMap<>();
        int left = 0, right = 0;
        int n = s.length();
        int len = 0;

        while (right < n) {
            if (c.containsKey(s.charAt(right))) {
                left = Math.max(c.get(s.charAt(right)) + 1, left);
            }
            c.put(s.charAt(right), right);
            len = Math.max(len, right - left + 1);
            right++;
        }

        return len;
    }

    public static void main(String[] args) {
        Solution sc = new Solution();
        System.out.println(sc.lengthOfLongestSubstring("abcabcbb"));
    }
}
