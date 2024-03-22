import java.util.stream.*;

public class hw1 {
    public static void main(String[] args) {
        String str = "hello world";
        char ch = 'l';

        long count = countOccurrences(str, ch);

        System.out.println("Number of occurrences of '" + ch + "' in '" + str + "': " + count);
    }

    public static long countOccurrences(String str, char ch) {
        return str.chars()
                .filter(c -> c == ch)
                .count();
    }
}
