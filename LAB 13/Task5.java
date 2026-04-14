import java.util.*;

public class Task5 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 5, 20, 8);

        int max = numbers.stream()
                         .max(Integer::compare)
                         .orElseThrow();

        System.out.println(max);
    }
}