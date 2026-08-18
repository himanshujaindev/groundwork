
import java.util.HashMap;
import java.util.Map;

class Solution {

    /*
    space = o(26) ; time = o(n^2)
    Use Hashtable
     */
    // int countSubstr(String s, int k) {
    //     int[] count_char;
    //     int res = 0, unique_char;
    //     // generate all substrings
    //     for (int i = 0; i < s.length(); i++) {
    //         unique_char = 0;
    //         count_char = new int[26];
    //         for (int j = i; j < s.length(); j++) {
    //             // found unique char
    //             if (count_char[s.charAt(j) - 'a'] == 0) {
    //                 unique_char += 1;
    //             }
    //             count_char[s.charAt(j) - 'a'] += 1;
    //             if (unique_char == k) {
    //                 res += 1;
    //                 // System.out.println(s.substring(i, j + 1));
    //             }
    //         }
    //     }
    //     return res;
    // }

    /*
    space = o(k) ; time = o(n)
    Use Hashmap
     */
    private int count(String s, int k) {
        int n = s.length();
        int beg = 0;
        int end = 0;
        int count = 0;
        Map<Character, Integer> map = new HashMap<>();
        while (end < n) {
            char c = s.charAt(end);
            map.put(c, map.getOrDefault(c, 0) + 1);
            while (map.size() > k) {
                char sc = s.charAt(beg);
                map.put(sc, map.get(sc) - 1);
                if (map.get(sc) == 0) {
                    map.remove(sc);
                }
                beg++;
            }
            count += end - beg + 1;
            end++;
        }
        // System.out.println(count);
        return count;
    }

    int countSubstr(String s, int k) {
        // your code here
        return count(s, k) - count(s, k - 1);
    }

    public static void main(String[] args) {
        Solution sc = new Solution();
        System.out.println(sc.countSubstr("aba", 2));
    }
}
