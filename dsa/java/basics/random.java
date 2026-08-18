
import java.util.Random;

public class random {

    public static void main(String[] args) {
        Random rand = new Random();

        System.out.println("Random Integers: " + rand.nextInt(10)); // 0 (inclusive) to 10 (exclusive)

        int high = 100;
        int low = 90;
        System.out.println("Random Integers: " + (rand.nextInt(high - low) + low)); // 90 (inclusive) to 100 (exclusive)
    }
}
