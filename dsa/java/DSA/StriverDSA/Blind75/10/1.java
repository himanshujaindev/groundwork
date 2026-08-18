
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

class Solution {

    public int[] topKFrequent(int[] nums, int k) {
        // hashmap -> num, freq
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i : nums) {
            hm.put(i, hm.getOrDefault(i, 0) + 1);
        }

        // create max heap -> add the hm elem -> fetch top k
        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>(
                (a, b) -> b.getValue() - a.getValue()
        ); // max heap ; sort by value (freq) ; highest freq elem will be at the top

        for (Map.Entry<Integer, Integer> en : hm.entrySet()) {
            pq.add(en);
        }

        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = pq.poll().getKey();
        }

        return res;
    }

    public static void main(String[] args) {
        Solution sc = new Solution();
        System.out.println(Arrays.toString(sc.topKFrequent(new int[]{1, 1, 1, 2, 2, 3, 3, 3, 3, 3, 3}, 2)));
    }
}
