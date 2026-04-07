import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();

        if (str1.equals(str2)) {
            System.out.println("Строки равны");
        } else {
            System.out.println("Строки не равны");
        }
    }
}