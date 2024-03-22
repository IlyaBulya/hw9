import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ex3 {
    public static void main(String[] args) {
        // Sample list of strings
        List<String> strings = new ArrayList<>();
        strings.add("banana");
        strings.add("apple");
        strings.add("cherry");
        strings.add("pear");

        Collections.sort(strings, (s1, s2) -> s1.compareTo(s2));

        System.out.println("Sorted list: " + strings);
    }
}

