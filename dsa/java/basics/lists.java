
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class lists {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        List<Integer> list1 = new ArrayList<>();

        for (int elem : arr1) {
            list1.add(elem);
        }

        // reverse
        Collections.reverse(list1);
        System.out.println(list1);

        // sort - asc
        Collections.sort(list1);
        System.out.println(list1);

        // sort - des
        Collections.sort(list1, Collections.reverseOrder());
        System.out.println(list1);

        // min, max
        int min = Collections.min(list1);
        int max = Collections.max(list1);
        System.out.println(min + " " + max);
    }
}
