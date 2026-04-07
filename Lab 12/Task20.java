import java.util.Scanner;

public class Task20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        boolean onlyDigits = true;

        for (int i = 0; i < text.length(); i++) {
            if (!Character.isDigit(text.charAt(i))) {
                onlyDigits = false;
                break;
            }
        }

        if (onlyDigits && !text.isEmpty()) {
            System.out.println("Строка содержит только цифры");
        } else {
            System.out.println("Строка содержит не только цифры");
        }
    }
}