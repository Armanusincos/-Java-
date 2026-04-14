import java.util.*;

public class Task6 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Java", "Lambda", "Hi", "Programming");

        words.stream()
             .sorted((a, b) -> Integer.compare(a.length(), b.length()))
             .forEach(System.out::println);
    }
}