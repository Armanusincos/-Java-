import java.util.*;

public class Task4 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4);

        numbers.stream()
               .map(n -> n * n)
               .forEach(System.out::println); 
    }
}