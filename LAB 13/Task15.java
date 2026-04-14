import java.util.*;

public class Task15 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5, 2, 8, 1, 3);

        list.stream()
            .filter(n -> n > 2)
            .map(n -> n * 2)
            .sorted()
            .forEach(System.out::println);
    }
}