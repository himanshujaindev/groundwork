
import java.util.Arrays;

public class arrays {

    static void reverse(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n / 2; i++) {
            int t = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = t;
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};

        // reverse - https://www.geeksforgeeks.org/reverse-an-array-in-java/
        reverse(arr1);
        System.out.println(Arrays.toString(arr1));

        // sort - ascending
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));

        // sort - descending (sort + reverse)
        Arrays.sort(arr1);
        reverse(arr1);
        System.out.println(Arrays.toString(arr1));

        // min, max
        int min = Arrays.stream(arr1).min().getAsInt();  // Minimum value
        int max = Arrays.stream(arr1).max().getAsInt();  // Maximum value
        System.out.println(min + " " + max);
    }
}
