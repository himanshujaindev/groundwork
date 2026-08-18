package DataStructures.Collection.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class list {
    public static void main(String[] args) {
        // Initialize the list

        // Way 1:
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);

        // Way 2: Array to list
        int[] arr1 = { 10, 20, 30 };

        // Array to list - Traverse the arr and add elements to the list
        List<Integer> list2 = new ArrayList<>();
        for (int elem : arr1) {
            list2.add(elem);
        }

        // Way 3:
        List<Integer> list3 = new ArrayList<>(Arrays.asList(10, 30, 20));

        // ------- //

        // list to array
        Integer[] list4 = list1.toArray(new Integer[list1.size()]);

        // Sort a list

        System.out.println(list3.toString());
        list3.sort(null); // Ascending
        // Collections.sort(list3); // Ascending
        // list3.sort(Comparator.reverseOrder()); // Descending
        System.out.println(list3.toString());

        System.out.println("Max = " + Collections.max(list1, null));
    }
}
