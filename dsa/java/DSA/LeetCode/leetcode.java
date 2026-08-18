
import java.util.Stack;

class Solution {

    public String decodeString(String s) {
        Stack<Integer> numStack = new Stack<>();
        Stack<Character> charStack = new Stack<>();

        int i = 0;
        String res = "";
        while (i < s.length()) {
            char ch = s.charAt(i);

            String numCh = "";
            while (Character.isDigit(ch) && i < s.length()) {
                numCh += ch;
                i++;
                ch = s.charAt(i);
            }

            if (!numCh.equals("")) {
                numStack.push(Integer.parseInt(numCh));
            }

            if (ch == ']') {
                String tempStr = "";
                while (!charStack.isEmpty()) {
                    char popedChar = charStack.pop();
                    if (popedChar != '[') {
                        tempStr = popedChar + tempStr;
                    } else {
                        break;
                    }
                }

                Integer count = numStack.pop();
                res += tempStr.repeat(count);

                for (char ch1 : res.toCharArray()) {
                    charStack.push(ch1);
                }
                res = "";

            } else {
                charStack.push(ch);
            }
            i++;
        }
        while (!charStack.isEmpty()) {
            res = charStack.pop() + res;
        }
        return res;
    }
}

public class leetcode {

    public static void main(String[] args) {
        Solution sc = new Solution();
        System.out.println(sc.decodeString("99[leetcode]"));
    }
}
