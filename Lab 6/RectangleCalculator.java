import java.util.Scanner;

public class RectangleCalculator {

    // Метод для вычисления площади прямоугольника
    public static double rectangleArea(double width, double height) {
        return width * height;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Введите ширину прямоугольника: ");
            double rectangleWidth = scanner.nextDouble();

            System.out.print("Введите высоту прямоугольника: ");
            double rectangleHeight = scanner.nextDouble();

            // Проверка на отрицательные значения
            if (rectangleWidth < 0 || rectangleHeight < 0) {
                System.out.println("Ошибка: ширина и высота не могут быть отрицательными.");
                return;
            }

            double areaResult = rectangleArea(rectangleWidth, rectangleHeight);

            System.out.println("Площадь прямоугольника равна: " + areaResult);

        } catch (Exception e) {
            System.out.println("Ошибка: введено некорректное значение. Нужно вводить числа.");
        }

        scanner.close();
    }
}