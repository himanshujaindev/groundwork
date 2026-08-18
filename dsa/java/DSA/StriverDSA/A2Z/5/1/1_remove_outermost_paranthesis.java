
class Solution {

    public String removeOuterParentheses(String s) {
        String res = "";
        int start = 0, open = 0, close = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(') {
                open += 1;
            } else if (ch == ')') {
                close += 1;
            }

            if (open == close) {
                res += s.substring(start + 1, i);
                open = 0;
                close = 0;
                start = i + 1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Solution sc = new Solution();
        System.out.println(sc.removeOuterParentheses("(()())(())"));
    }
}
