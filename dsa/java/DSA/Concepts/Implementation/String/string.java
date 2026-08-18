package DataStructures.Implementation.String;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/*

Ref = https://www.javatpoint.com/java-string 

- Strings are immutable
- 

 */

public class string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String 1 = ");
        String str1 = sc.next();

        System.out.print("Enter String 2 = ");
        String str2 = sc.next();

        // Comparison
        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str2));
        System.out.println(str1.compareTo(str2));

        // Concatenation
        System.out.println(str1 + " " + str2 + 30);
        System.out.println(str1.concat(str2));
        System.out.println(String.join("-", str1, str2));

        List<String> liststr = Arrays.asList("abc", "def", "ijk");
        String concat_str = liststr.stream().collect(Collectors.joining(", ")); // performs joining operation
        System.out.println(concat_str);

        // Sort
        String test = "hello";
        char[] charArray = test.toCharArray();
        Arrays.sort(charArray);
        System.out.println(String.valueOf(charArray));
        System.out.println(new String(charArray));

    }
}
