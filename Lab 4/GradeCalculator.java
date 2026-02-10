import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите балл (0-100): ");
        int score = scanner.nextInt();

        if (score >= 90 && score <= 100) {
            System.out.println("Оценка: 5 (Отлично)");
        }
        else if (score >= 75) {
            System.out.println("Оценка: 4 (Хорошо)");
        }
        else if (score >= 60) {
            System.out.println("Оценка: 3 (Удовлетворительно)");
        }
        else if (score >= 0) {
            System.out.println("Оценка: 2 (Неудовлетворительно)");
        }
        else {
            System.out.println("Ошибка: неверный балл");
        }

    }
}
