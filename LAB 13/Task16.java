import java.util.*;
import java.util.stream.Collectors;

class Student {
    String name;
    int age;
    double grade;

    Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}

public class Task16 {
    public static void main(String[] args) {

        List<Student> students = Arrays.asList(
            new Student("Ali", 20, 85),
            new Student("Dana", 20, 75),
            new Student("Max", 21, 90)
        );

        Map<Integer, List<Student>> grouped =
                students.stream()
                        .collect(Collectors.groupingBy(s -> s.age));

        grouped.forEach((age, list) -> {
            System.out.println("Age: " + age);
            list.forEach(s -> System.out.println("  " + s.name));
        });
    }
}