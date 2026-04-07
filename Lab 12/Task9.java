import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        String[] parts = text.split(",");

        for (String part : parts) {
            System.out.println(part.trim());
        }
    }
}