import java.util.*;

public class Task8 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Java", "Lambda", "Stream", "Hi");

        words.stream()
             .filter(s -> s.length() > 5)
             .forEach(System.out::println); // Lambda Stream
    }
}