package DataStructures.Implementation.String;

public class stringbuilder {
    public static void main(String[] args) {
        // StringBuilder is mutable as compared to String datatype
        StringBuilder sb = new StringBuilder();

        for (int i = 65; i < 75; i++) {
            char ch = (char) i;
            sb.append(ch);
        }

        System.out.println(sb.toString());
    }
}
