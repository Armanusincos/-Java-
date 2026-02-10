import java.util.Scanner;

public class TemperatureState {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите температуру (°C): ");
        int t = scanner.nextInt();

        if (t < 10) {
            System.out.println("Холодно");
        } else if (t <= 25) {
            System.out.println("Тепло");
        } else {
            System.out.println("Жарко");
        }
    }
}
