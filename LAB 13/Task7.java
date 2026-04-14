import java.util.*;

public class Task7 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("java", "hello", "world");

        words.stream()
             .map(s -> s.substring(0, 1).toUpperCase() + s.substring(1))
             .forEach(System.out::println); 
    }
}