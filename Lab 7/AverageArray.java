import java.util.Scanner;

public class AverageArray {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double[] D = new double[17];
        double sum = 0;
        int index = 0;

        System.out.println("Введите 17 вещественных чисел:");

        while (index < D.length) {

            if (scanner.hasNextDouble()) {
                D[index] = scanner.nextDouble();
                sum += D[index];
                index++;
            } else {
                System.out.println("Ошибка! Введите число:");
                scanner.next();
            }
        }

        double average = sum / D.length;

        System.out.println("Среднее арифметическое: " + average);
    }
}