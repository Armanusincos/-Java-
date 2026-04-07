import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        String result = text.replaceAll("\\s+", "");
        System.out.println("Без пробелов: " + result);
    }
}