package DataStructures.Collection.Maps;

import java.security.Key;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import Common.io;

class Pair {
    int a, b;

    Pair(int x, int y) {
        this.a = x;
        this.b = y;
    }

    @Override
    public String toString() {
        return "{" +
                " a='" + this.a + "'" +
                ", b='" + this.b + "'" +
                "}";
    }
}

public class hashmap {
    public static void main(String[] args) {
        int[] arr = io.readArr();

        // Freq of array elements
        Map<Integer, Integer> hm = new HashMap<>();

        for (int elem : arr) {
            // if (hm.containsKey(elem)) {
            // hm.put(elem, hm.get(elem) + 1);
            // } else {
            // hm.put(elem, 1);
            // }

            hm.put(elem, hm.getOrDefault(elem, 0) + 1);
        }

        System.out.print("Array = ");
        io.displayArr(arr);
        System.out.println("Hashmap = " + hm.toString());

        for (Map.Entry<Integer, Integer> entry : hm.entrySet())
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());

        // hm: key = int; val = list -> Usecase: Graph edges to HM
        int[][] edges = { { 0, 1 }, { 0, 2 }, { 3, 5 }, { 5, 4 }, { 4, 3 } };
        Map<Integer, List<Integer>> graph = new HashMap<>();
        for (int[] edge : edges) {
            int a = edge[0], b = edge[1];
            graph.computeIfAbsent(a, val -> new ArrayList<Integer>()).add(b);
            graph.computeIfAbsent(b, val -> new ArrayList<Integer>()).add(a);
        }

        System.out.println("Graph = " + graph.toString());

        // hm: Integer, Set<Integer>
        // Set<Integer> set = hm.get(key);
        // set.remove(element); WILL THE ELEMENT GET REMOVED FROM THE HM ?? YES
        Map<Integer, LinkedHashSet<Integer>> cache = new HashMap<>();
        cache.computeIfAbsent(1, val -> new LinkedHashSet<>()).add(10);
        cache.computeIfAbsent(1, val -> new LinkedHashSet<>()).add(20);
        cache.computeIfAbsent(1, val -> new LinkedHashSet<>()).add(30);
        System.out.println(cache.toString());

        Set<Integer> set = cache.get(1);
        set.remove(20);

        System.out.println(cache.toString());
    }
}
