import java.util.Scanner;

public class RecursiveFactorialCalculator {

    // Рекурсивный метод вычисления факториала
    public static long factorial(int number) {

        // Обработка отрицательных чисел
        if (number < 0) {
            throw new IllegalArgumentException("Факториал не существует для отрицательных чисел.");
        }

        // Базовый случай
        if (number == 0 || number == 1) {
            return 1;
        }

        // Рекурсивный вызов
        return number * factorial(number - 1);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Введите целое число для вычисления факториала: ");
            int userInputNumber = scanner.nextInt();

            if (userInputNumber < 0) {
                System.out.println("Ошибка: факториал нельзя вычислить для отрицательного числа.");
                return;
            }

            long factorialResult = factorial(userInputNumber);

            System.out.println("Факториал числа " + userInputNumber + " равен: " + factorialResult);

        } catch (Exception e) {
            System.out.println("Ошибка: введено некорректное значение. Нужно вводить целое число.");
        }

        scanner.close();
    }
}