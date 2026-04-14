import java.util.*;

class Order {
    int id;
    double amount;

    Order(int id, double amount) {
        this.id = id;
        this.amount = amount;
    }
}

public class Task20 {
    public static void main(String[] args) {
        List<Order> orders = Arrays.asList(
            new Order(1, 500),
            new Order(2, 1500),
            new Order(3, 2000)
        );

        orders.stream()
              .filter(o -> o.amount > 1000)
              .sorted(Comparator.comparing(o -> o.amount))
              .forEach(o -> System.out.println(o.id + " " + o.amount));
    }
}