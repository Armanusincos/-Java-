import java.util.Scanner;

public class MaxValueCalculator {


    public static int max(int firstNumber, int secondNumber) {
        return (firstNumber > secondNumber) ? firstNumber : secondNumber;
    }


    public static double max(double firstNumber, double secondNumber) {
        return (firstNumber > secondNumber) ? firstNumber : secondNumber;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Введите первое целое число: ");
            int firstIntNumber = scanner.nextInt();

            System.out.print("Введите второе целое число: ");
            int secondIntNumber = scanner.nextInt();

            int maxIntResult = max(firstIntNumber, secondIntNumber);

            System.out.println("Максимальное целое число: " + maxIntResult);

            // Демонстрация метода для double
            System.out.print("\nВведите первое дробное число: ");
            double firstDoubleNumber = scanner.nextDouble();

            System.out.print("Введите второе дробное число: ");
            double secondDoubleNumber = scanner.nextDouble();

            double maxDoubleResult = max(firstDoubleNumber, secondDoubleNumber);

            System.out.println("Максимальное дробное число: " + maxDoubleResult);

        } catch (Exception e) {
            System.out.println("Ошибка: введено некорректное значение. Нужно вводить числа.");
        }

        scanner.close();
    }
}