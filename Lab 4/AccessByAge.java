import java.util.Scanner;

public class AccessByAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите ваш возраст: ");
        int age = scanner.nextInt();

        if (age >= 18) {
            System.out.println("Доступ разрешён");
        } else if (age >= 0) {
            System.out.println("Доступ запрещён (нужно 18+)");
        } else {
            System.out.println("Ошибка: возраст не может быть отрицательным");
        }
    }
}
