
class Solution {

    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        int initialX = x;
        int y = 0;
        while (x != 0) {
            y = (y * 10) + (x % 10);
            x = x / 10;
        }
        return initialX == y;
    }

    public static void main(String[] args) {
        Solution sc = new Solution();
        System.out.println(sc.isPalindrome(-121));
    }
}
