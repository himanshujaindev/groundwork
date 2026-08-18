package DataStructures.Collection.Maps;

import java.util.SortedMap;
import java.util.TreeMap;

public class treemap {
    public static void main(String[] args) {
        SortedMap<Integer, String> tm = new TreeMap<>();
        tm.put(2, "Hello");
        tm.put(4, "Hello");
        tm.put(1, "Hello");
        tm.put(2, "Hee"); // Overwrite the value

        System.out.println(tm);
        System.out.println(tm.keySet());
        System.out.println(tm.values());
        System.out.println(tm.size());

        System.out.println(tm.containsKey(5));
        System.out.println(tm.firstKey());
        System.out.println(tm.lastKey());
        System.out.println(tm.remove(2)); // Returns value

        tm.clear();
        System.out.println(tm);
    }
}
