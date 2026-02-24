import java.util.Scanner;

public class RecursivePowerCalculator {

    // Рекурсивный метод вычисления степени
    public static long power(int baseNumber, int exponentValue) {

        // Базовый случай
        if (exponentValue == 0) {
            return 1;
        }

        // Рекурсивный вызов
        return baseNumber * power(baseNumber, exponentValue - 1);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Введите основание степени (целое число): ");
            int baseNumber = scanner.nextInt();

            System.out.print("Введите показатель степени (целое число >= 0): ");
            int exponentValue = scanner.nextInt();

            if (exponentValue < 0) {
                System.out.println("Ошибка: программа работает только с положительными степенями.");
                return;
            }

            long powerResult = power(baseNumber, exponentValue);

            System.out.println(baseNumber + " в степени " + exponentValue + " равно: " + powerResult);

        } catch (Exception e) {
            System.out.println("Ошибка: введено некорректное значение. Нужно вводить целые числа.");
        }

        scanner.close();
    }
}