
class Solution {

    /*
    o(32); o(1)
     */
    public int getSum(int a, int b) {
        while (b != 0) {
            int s = a ^ b; // sum without carry
            int c = (a & b) << 1; // carry shifted left
            a = s;
            b = c;
        }
        return a;
    }

    public static void main(String[] args) {
        Solution sc = new Solution();
        System.out.println(sc.getSum(-999, 0));
    }
}
