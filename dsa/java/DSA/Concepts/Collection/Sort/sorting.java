package DataStructures.Collection.Sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.HashMap;
import java.util.PriorityQueue;

class Company implements Comparable<Company> {
    private String name;
    private int salary;

    Company(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return this.salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "{" +
                " name='" + getName() + "'" +
                ", salary='" + getSalary() + "'" +
                "}";
    }

    @Override
    public int compareTo(Company c) {
        if (this.getSalary() > c.getSalary())
            return 1;
        else
            return -1;
    }
}

public class sorting {

    public static String frequencySort(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();
        for (char ch : s.toCharArray())
            hm.put(ch, hm.getOrDefault(ch, 0) + 1);

        // Lambda -  Decreasing Order
        PriorityQueue<Character> maxHeap = new PriorityQueue<>((a, b) -> hm.get(b) - hm.get(a));
        maxHeap.addAll(hm.keySet());

        StringBuilder res = new StringBuilder();
        while (!maxHeap.isEmpty()) {
            char key = maxHeap.poll();
            int val = hm.get(key);

            while (val-- > 0)
                res.append(key);
        }

        return res.toString();
    }

    public static void main(String[] args) {

        Random rand = new Random();

        // Sort Type = List of Integer; Ascending
        List<Integer> intList1 = new ArrayList<>(Arrays.asList(4, 2, 5));

        System.out.println("Sort Type = List of Integer; Ascending");
        System.out.println("Original list = " + intList1);
        Collections.sort(intList1);
        System.out.println("Sorted list = " + intList1);
        System.out.println();

        // Sort Type = List of Integer; Descending
        List<Integer> intList2 = new ArrayList<>(Arrays.asList(4, 2, 5));

        System.out.println("Sort Type = List of Integer; Descending");
        System.out.println("Original list = " + intList2);
        Collections.sort(intList2, Collections.reverseOrder());
        System.out.println("Sorted list = " + intList2);
        System.out.println();

        // Sort Type = List of Strings; Ascending
        List<String> stringList1 = new ArrayList<>(Arrays.asList("Hi", "Bye", "Aaa"));

        System.out.println("Sort Type = List of Strings; Ascending");
        System.out.println("Original string = " + stringList1);
        Collections.sort(stringList1);
        System.out.println("Sorted string = " + stringList1);
        System.out.println();

        // Sort Type = List of List of Integer; Ascending -> Using Comparator-compare
        List<List<Integer>> listIntList1 = new ArrayList<>();
        listIntList1.add(Arrays.asList(rand.nextInt(10), rand.nextInt(10), rand.nextInt(10)));
        listIntList1.add(Arrays.asList(rand.nextInt(10), rand.nextInt(10), rand.nextInt(10)));
        listIntList1.add(Arrays.asList(rand.nextInt(10), rand.nextInt(10), rand.nextInt(10)));

        Comparator<List<Integer>> comparator1 = new Comparator<List<Integer>>() {
            @Override
            public int compare(List<Integer> o1, List<Integer> o2) {
                if (o1.get(0) > o2.get(0))
                    return 1; // Sorting Based on 1st element; Ascending
                else
                    return -1;
            }
        };

        System.out.println("Sort Type = List of List of Integer; Ascending -> Using Comparator-compare");
        System.out.println("Original list = " + listIntList1);
        Collections.sort(listIntList1, comparator1);
        System.out.println("Sorted list = " + listIntList1);
        System.out.println();

        // Sort Type = List of List of Strings; Ascending -> Using Comparator-compare
        List<List<String>> listStringList1 = new ArrayList<>();
        listStringList1.add(Arrays.asList("Phone", "Bye"));
        listStringList1.add(Arrays.asList("Hello", "See"));
        listStringList1.add(Arrays.asList("Wave", "Ant"));

        Comparator<List<String>> comparator2 = new Comparator<List<String>>() {
            @Override
            public int compare(List<String> o1, List<String> o2) {
                if (o1.get(1).compareTo(o2.get(1)) > 0)
                    return 1; // Sorting Alpha Based on 2st element; Ascending
                else
                    return -1;
            }
        };

        System.out.println("Sort Type = List of List of Strings; Ascending -> Using Comparator-compare");
        System.out.println("Original list = " + listStringList1);
        Collections.sort(listStringList1, comparator2);
        System.out.println("Sorted list = " + listStringList1);
        System.out.println();

        // Sort Type = List of object; Ascending -> Using Comparator-compare
        List<Company> companies = new ArrayList<>();
        companies.add(new Company("Google", 101));
        companies.add(new Company("Microsoft", 99));
        companies.add(new Company("Amazon", 102));

        /*
        
        Comparator<Company> comparator3 = new Comparator<Company>() {
            @Override
            public int compare(Company o1, Company o2) {
                if (o1.getSalary() > o2.getSalary())
                    return 1;
                else
                    return -1;
            }
        };
        
        System.out.println("Sort Type = List of object; Ascending -> Using Comparator-compare");
        System.out.println("Original list = " + companies.toString());
        Collections.sort(companies, comparator3);
        System.out.println("Sorted list = " + companies.toString());
        System.out.println();
        
        */

        // Sort Type = List of object; Ascending -> Using Comparable-compareTo

        System.out.println("Sort Type = List of object; Ascending -> Using Comparable-compareTo");
        System.out.println("Original list = " + companies.toString());
        Collections.sort(companies);
        System.out.println("Sorted list = " + companies.toString());
        System.out.println();

        // Sort Type = List of Integer; Based on Ascending order of another array ->
        // Using Comparator-comparingInt

        int[] sortOrder1 = { 2, 3, 1 };
        List<Integer> array1 = new ArrayList<>(Arrays.asList(0, 1, 2));

        System.out.println(
                "Sort Type = List of Integer; Based on Ascending order of another array -> Using Comparator-comparingInt");
        System.out.println("Original array = " + array1.toString());
        Collections.sort(array1, Comparator.comparingInt(i -> sortOrder1[i]));
        System.out.println("Sorted array = " + array1.toString());
        System.out.println();

        // Sort Type = List of Integer; Based on Descending order of another array ->
        // Using Comparator-comparingInt

        int[] sortOrder2 = { 2, 3, 1 };
        List<Integer> array2 = new ArrayList<>(Arrays.asList(0, 1, 2));

        System.out.println(
                "Sort Type = List of Integer; Based on Descending order of another array -> Using Comparator-comparingInt");
        System.out.println("Original array = " + array2.toString());
        Collections.sort(array2, Comparator.comparingInt(i -> -sortOrder2[i]));
        System.out.println("Sorted array = " + array2.toString());
        System.out.println();

        // Sort Type = String; Based on frequency of characters
        String string1 = "tree";
        String resString1 = frequencySort(string1);

        System.out.println("Sort Type = String; Based on frequency of characters");
        System.out.println("Original string = " + string1);
        System.out.println("Sorted string = " + resString1);
        System.out.println();

        // USING LAMBDA EXPRESSION

        // Sort Type = int[][]; Based on index 1 ascending
        int[][] tasks = { { 1, 2 }, { 2, 4 }, { 3, 2 }, { 4, 1 } };
        System.out.println("Sort Type = int[][]; Based on index 1 ascending");
        System.out.println("Original int[][] = ");
        for (int[] a : tasks)
            System.out.println(a[0] + " " + a[1]);

        Arrays.sort(tasks, (a, b) -> Integer.compare(a[1], b[1]));

        System.out.println("Sorted int[][] = ");
        for (int[] a : tasks)
            System.out.println(a[0] + " " + a[1]);

        System.out.println();

        // Sort Type = List of List of Integer; Ascending -> Using Lambda
        List<List<Integer>> lambdaListIntList1 = new ArrayList<>();
        lambdaListIntList1.add(Arrays.asList(rand.nextInt(10), rand.nextInt(10), rand.nextInt(10)));
        lambdaListIntList1.add(Arrays.asList(rand.nextInt(10), rand.nextInt(10), rand.nextInt(10)));
        lambdaListIntList1.add(Arrays.asList(rand.nextInt(10), rand.nextInt(10), rand.nextInt(10)));

        System.out.println("Sort Type = List of List of Integer; Ascending -> Using Lambda");
        System.out.println("Original list = " + lambdaListIntList1);
        Collections.sort(lambdaListIntList1, (a, b) -> a.get(1) - b.get(1));
        System.out.println("Sorted list = " + lambdaListIntList1);
        System.out.println();

    }

}
