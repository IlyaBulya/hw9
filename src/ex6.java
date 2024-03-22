import java.util.*;

public class ex6 {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("apple");
        strings.add("banana");
        strings.add("apple");
        strings.add("orange");
        strings.add("banana");
        strings.add("apple");
        strings.add("banana");

        Map<String, Integer> repetitionMap = countStringRepetitions(strings);

        // Print the map
        repetitionMap.forEach((key, value) -> System.out.println(key + ": " + value));
    }

    public static Map<String, Integer> countStringRepetitions(List<String> strings) {
        Map<String, Integer> repetitionMap = new HashMap<>();

        for (String str : strings) {
            repetitionMap.put(str, repetitionMap.getOrDefault(str, 0) + 1);
        }

        return repetitionMap;
    }
}

