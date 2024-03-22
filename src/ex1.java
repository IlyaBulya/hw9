import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ex1 {
    public static void main(String[] args) {
        // Sample list of strings
        List<String> strings = new ArrayList<>();
        strings.add("apple");
        strings.add("banana");
        strings.add("cherry");

        // Convert the list of strings to uppercase using a lambda expression
        List<String> uppercaseStrings = strings.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        // Print the uppercase strings
        System.out.println("Original list: " + strings);
        System.out.println("Uppercase list: " + uppercaseStrings);
    }
}
