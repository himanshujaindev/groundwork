
import java.util.Scanner;

public class read {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter num = ");
        int n = sc.nextInt();

        System.out.print("Enter name = ");
        String s = sc.next();

        System.out.print("Enter char = ");
        char ch = sc.next().charAt(0);

        System.out.print("Enter boolean = ");
        boolean b = sc.nextBoolean();

        System.out.print("Enter Float num = ");
        float f = sc.nextFloat();

        System.out.println("Num = " + n + " Name = " + s
                + " Char = " + ch + " Boolean = " + b + " Float = " + f);
    }
}
