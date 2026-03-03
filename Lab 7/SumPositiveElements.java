import java.util.Scanner;

public class SumPositiveElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] B = new int[15];
        int sum = 0;
        int index = 0;

        System.out.println("Введите 15 целых чисел:");

        while (index < B.length) {
            if (scanner.hasNextInt()) {
                B[index] = scanner.nextInt();

                if (B[index] > 0) {
                    sum += B[index];
                }

                index++;
            } else {
                System.out.println("Ошибка! Введите целое число:");
                scanner.next(); 
            }
        }

        System.out.println("Сумма положительных элементов: " + sum);
    }
}