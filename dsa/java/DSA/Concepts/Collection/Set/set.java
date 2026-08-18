package DataStructures.Collection.Set;

import java.util.HashSet;
import java.util.Set;

public class set {
    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        Set<Character> seen = new HashSet<>();
        for (char ch : sentence.toCharArray()) {
            seen.add(ch);
        }

        System.out.println(seen);
        if (seen.size() == 26)
            System.out.println("true");

        Set<Integer> s = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            s.add(i);
            s.remove(i - 1);
        }
        System.out.println(s.toString());
    }
}
