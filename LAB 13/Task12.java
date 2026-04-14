import java.util.function.Supplier;
import java.util.Random;

public class Task12 {
    public static void main(String[] args) {
        Supplier<Integer> randomNumber = () -> new Random().nextInt(100);

        System.out.println(randomNumber.get());
    }
}