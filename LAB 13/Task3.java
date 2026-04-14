import java.util.*;
import java.util.function.Predicate;

public class Task3 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        Predicate<Integer> isOdd = n -> n % 2 != 0;

        numbers.stream()
               .filter(isOdd)
               .forEach(System.out::println); 
    }
}