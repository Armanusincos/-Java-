import java.util.Scanner;

public class SumNegativeElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] A = new int[20];
        int sum = 0;
        int index = 0;

        System.out.println("Введите 20 целых чисел:");

        while (index < A.length) {
            if (scanner.hasNextInt()) {
                A[index] = scanner.nextInt();

                if (A[index] < 0) {
                    sum += A[index];
                }

                index++;
            } else {
                System.out.println("Ошибка! Введите целое число:");
                scanner.next(); 
            }
        }

        System.out.println("Сумма отрицательных элементов: " + sum);
    }
}