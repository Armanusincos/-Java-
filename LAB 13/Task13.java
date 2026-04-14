import java.util.*;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class Task13 {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
            new Person("Ali", 25),
            new Person("Dana", 20),
            new Person("Max", 30)
        );

        people.stream()
              .sorted(Comparator.comparing(p -> p.age))
              .forEach(p -> System.out.println(p.name + " " + p.age));
    }
}