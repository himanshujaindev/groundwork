
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {

    public String reverseWords(String s) {
        String[] formatListString = s.strip().replaceAll("\\s+", " ").split(" ");
        List<String> wordList = new ArrayList<>(Arrays.asList(formatListString));
        String res = String.join(" ", wordList.reversed());
        return res;
    }

    public static void main(String[] args) {
        Solution sc = new Solution();
        System.out.println(sc.reverseWords("   a good   example"));
    }
}
