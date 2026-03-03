import java.util.Scanner;

public class ProductNegativeA {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double[] A = new double[12];
        double product = 1;
        int index = 0;
        boolean found = false; // проверка, были ли отрицательные числа

        System.out.println("Введите 12 вещественных чисел:");

        while (index < A.length) {

            if (scanner.hasNextDouble()) {
                A[index] = scanner.nextDouble();

                if (A[index] < 0) {
                    product *= A[index];
                    found = true;
                }

                index++;
            } else {
                System.out.println("Ошибка! Введите число:");
                scanner.next();
            }
        }

        if (found) {
            System.out.println("Произведение отрицательных элементов: " + product);
        } else {
            System.out.println("Отрицательных элементов нет.");
        }
    }
}