import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ex5 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(5);
        numbers.add(8);
        numbers.add(3);
        numbers.add(12);
        numbers.add(6);

        Optional<Integer> max = numbers.stream()
                .max(Integer::compareTo);

        Optional<Integer> min = numbers.stream()
                .min(Integer::compareTo);

        System.out.println("Maximum value: " + (max.isPresent() ? max.get() : "No maximum value found"));
        System.out.println("Minimum value: " + (min.isPresent() ? min.get() : "No minimum value found"));
    }
}

