
import java.util.Arrays;



class Solution {

    /*
    - sort based on start interval
    - overlapping = start of second interval < end of first interval
    - which interval to remove in case of overlap = interval which ends last
     */
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0], b[0]));

        int res = 0, i=1, endIndex = intervals[0][1];

        while(i < intervals.length) {
            int startIndex = intervals[i][0];

            // overlapping
            if(startIndex < endIndex) {
                res++;
                endIndex = (endIndex < intervals[i][1]) ? endIndex : intervals[i][1];
            } else {
                endIndex = intervals[i][1];
            }

            i++;
        }
        return res;
    }

    public static void main(String[] args) {
        Solution sc = new Solution();
        System.out.println(sc.eraseOverlapIntervals(new int[][]{{1,2},{2,3},{3,4},{1,3}}));
    }
}
