import java.util.Scanner;

public class ProductPositiveC {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] C = new int[25];
        long product = 1; 
        int index = 0;
        boolean found = false;

        System.out.println("Введите 25 целых чисел:");

        while (index < C.length) {

            if (scanner.hasNextInt()) {
                C[index] = scanner.nextInt();

                if (C[index] > 0) {
                    product *= C[index];
                    found = true;
                }

                index++;
            } else {
                System.out.println("Ошибка! Введите целое число:");
                scanner.next();
            }
        }

        if (found) {
            System.out.println("Произведение положительных элементов: " + product);
        } else {
            System.out.println("Положительных элементов нет.");
        }
    }
}