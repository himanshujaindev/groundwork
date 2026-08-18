
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {

    /*
    nonoverlap intervals
        newInterval[end] < curInterval[start] -> res.add(newInterval) and add all other remaining intervals
        newInterval[start] > curInterval[end] -> res.add(curInterval)

    overlap
        update newInterval -> min(), max()
     */
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<List<Integer>> list = new ArrayList<>();

        boolean done = false;
        for (int i = 0; i < intervals.length; i++) {
            // System.out.println("i = " + i);
            if (newInterval[1] < intervals[i][0]) {
                list.add(Arrays.asList(newInterval[0], newInterval[1]));
                for (int j = i; j < intervals.length; j++) {
                    // System.out.println("j = " + j);
                    list.add(Arrays.asList(intervals[j][0], intervals[j][1]));
                }
                done = true;
                break;
            } else if (newInterval[0] > intervals[i][1]) {
                list.add(Arrays.asList(intervals[i][0], intervals[i][1]));
            } else {
                newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
                newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
            }
        }

        if (!done) {
            list.add(Arrays.asList(newInterval[0], newInterval[1]));
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
        int[][] res = sc.insert(new int[][]{{1, 3}, {6, 9}}, new int[]{2, 5});

        for (int[] elem : res) {
            System.out.println(Arrays.toString(elem));
        }
    }
}
