
public class convert_type {

    public static void main(String[] args) {

        // int to String
        int num1 = 10;
        String string1 = String.valueOf(num1);
        System.out.println(string1.getClass());

        // String to int
        int num2 = Integer.valueOf(string1);
        System.out.println(num2);

        // String to char array
        String str1 = "hello";
        char[] charArr1 = str1.toCharArray();

    }
}
