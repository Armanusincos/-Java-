import java.util.Scanner;

public class NumberInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int x = scanner.nextInt();

        if (x >= 10 && x <= 50) {
            System.out.println("Число входит в диапазон [10; 50]");
        } else {
            System.out.println("Число НЕ входит в диапазон [10; 50]");
        }
    }
}
