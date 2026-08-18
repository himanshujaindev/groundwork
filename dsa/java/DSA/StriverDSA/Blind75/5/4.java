
import java.util.Arrays;





class Solution {

    /*
    - sum of n = n*(n+1)/2 = perfectSum
    - sum of grid = sum

    - x - y = perfectSum - sum = sumDiff
    - sqrDiff = x^2 - y^2 = (x+y)(x-y)
      sqrDiff / sumDiff = x+y
    
    Solve x,y
    */
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        long sum = 0, sqrSum = 0;
        long n = grid.length;
        long total = n*n;
        for(int[] arr: grid) {
            for(int elem: arr) {
                sum += elem;
                sqrSum += (long) (elem * elem);
            }
        }

        // Expected sum: n(n+1)/2, Expected square sum: n(n+1)(2n+1)/6
        long perfectSum = (total*(total+1))/2;
        long sqrPerfectSum = (total*(total+1)*(2*total+1))/6;

        long sumDiff = sum - perfectSum;
        long sqrDiff = sqrSum - sqrPerfectSum;
        long sqrSumDiff = sqrDiff / sumDiff;

        int x = (int) Math.abs((sumDiff + sqrSumDiff) / 2);
        int y = (int)  Math.abs(x - sumDiff);
        
        return new int[]{x,y};
    }

    public static void main(String[] args) {
        Solution sc = new Solution();
        int[] res = sc.findMissingAndRepeatedValues(new int[][]{{9,1,7},{8,9,2},{3,4,6}});
        System.out.println(Arrays.toString(res));
    }
}
