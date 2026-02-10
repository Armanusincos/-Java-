import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        double a = scanner.nextDouble();

        System.out.print("Введите второе число: ");
        double b = scanner.nextDouble();

        System.out.print("Введите операцию (+, -, *, /): ");
        char op = scanner.next().charAt(0);

        double result;

        switch (op) {
            case '+':
                result = a + b;
                System.out.println("Результат: " + result);
                break;

            case '-':
                result = a - b;
                System.out.println("Результат: " + result);
                break;

            case '*':
                result = a * b;
                System.out.println("Результат: " + result);
                break;

            case '/':
                if (b == 0) {
                    System.out.println("Ошибка: деление на ноль!");
                } else {
                    result = a / b;
                    System.out.println("Результат: " + result);
                }
                break;

            default:
                System.out.println("Ошибка: неизвестная операция");
        }
    }
}
