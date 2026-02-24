import java.util.Scanner;

public class EvenNumberChecker {


    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Введите целое число: ");
            int userNumber = scanner.nextInt();

            // Проверка на отрицательное число
            if (userNumber < 0) {
                System.out.println("Ошибка: число не должно быть отрицательным.");
                return;
            }

            boolean evenCheckResult = isEven(userNumber);

            if (evenCheckResult) {
                System.out.println("Число " + userNumber + " является чётным.");
            } else {
                System.out.println("Число " + userNumber + " является нечётным.");
            }

        } catch (Exception e) {
            System.out.println("Ошибка: введено некорректное значение. Нужно вводить целое число.");
        }

        scanner.close();
    }
}