
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {

    /*
    sort based on start interval
    nonoverlapping -> List.lastInterval[end] < curInterval[start]
     */
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        int n = intervals.length;
        List<List<Integer>> list = new ArrayList<>();
        list.add(Arrays.asList(intervals[0][0], intervals[0][1]));

        int i = 1;
        while (i < n) {
            int preEnd = list.get(list.size() - 1).get(1);
            int curStart = intervals[i][0];

            if (preEnd < curStart) {
                list.add(Arrays.asList(intervals[i][0], intervals[i][1])); // curInterval
            } else {
                int newEnd = Math.max(preEnd, intervals[i][1]);
                list.get(list.size() - 1).set(1, newEnd);
            }
            i++;
        }

        int[][] res = new int[list.size()][2];
        for (int k = 0; k < list.size(); k++) {
            List<Integer> row = list.get(k);
            for (int m = 0; m < 2; m++) {
                res[k][m] = row.get(m);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Solution sc = new Solution();
        int[][] res = sc.merge(new int[][]{{1, 3}, {2, 6}, {8, 10}, {15, 18}});
        for (int[] elem : res) {
            System.out.println(Arrays.toString(elem));
        }
    }
}
