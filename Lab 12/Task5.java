import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        String word = scanner.nextLine();

        if (text.contains(word)) {
            System.out.println("Слово найдено");
        } else {
            System.out.println("Слово не найдено");
        }
    }
}