import java.util.function.Function;

public class Task2 {
    public static void main(String[] args) {
        Function<String, String> toUpper = s -> s.toUpperCase();

        System.out.println(toUpper.apply("привет")); 
    }
}