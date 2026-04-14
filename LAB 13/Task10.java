import java.util.*;

public class Task10 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5, 2, 9);

        Optional<Integer> min = list.stream().min(Integer::compare);

        System.out.println(min.orElse(-1)); 
    }
}