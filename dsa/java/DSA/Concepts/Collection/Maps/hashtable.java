package DataStructures.Collection.Maps;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class hashtable {
    public static void main(String[] args) {
        // Same as hashmap but the keys are not sorted

        // I/p: 2111
        // hm: {1:3, 2:1}
        // ht: {2:1, 1:3}

        String str = "2111";

        Map<Character, Integer> ht = new Hashtable<>();
        for (char ch : str.toCharArray())
            ht.put(ch, ht.getOrDefault(ch, 0) + 1);

        System.out.println("Hashtable = " + ht);

        Map<Character, Integer> hm = new HashMap<>();
        for (char ch : str.toCharArray())
            hm.put(ch, hm.getOrDefault(ch, 0) + 1);

        System.out.println("Hashmap = " + hm);
    }
}
