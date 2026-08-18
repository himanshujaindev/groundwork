
import java.util.ArrayList;
import java.util.List;

/*

In case of primitives it purely pass by value and 
in case of Objects it is pass by value of the reference.

When you pass list from the main method to method passObjectToFuntion() 
as an argument there is another (copy) reference that is created that 
points to the same List instance. Any changes made from either of the 
references will reflect on the same actual instance. However if you assign 
one of the reference to some new Object the other reference will still point
to the same original instance.

 */
public class functions {

    public static void passObjectToFuntion(List<Integer> list) {
        list.add(10);
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        System.out.println(list.toString());
        passObjectToFuntion(list);
        System.out.println(list.toString());
    }
}
