import java.util.*;

public class MegaCalculator {

    static Scanner scanner = new Scanner(System.in);
    static ArrayList<String> history = new ArrayList<>();

    public static void main(String[] args) {
        while (true) {
            try {
                System.out.println("\n=== КАЛЬКУЛЯТОР ===");
                System.out.println("1 - Сложение");
                System.out.println("2 - Вычитание");
                System.out.println("3 - Умножение");
                System.out.println("4 - Деление");
                System.out.println("5 - Степень (x^y)");
                System.out.println("6 - Квадратный корень");
                System.out.println("7 - Процент (a % от b)");
                System.out.println("8 - sin");
                System.out.println("9 - cos");
                System.out.println("10 - tan");
                System.out.println("11 - Выражение (2 + 3 * 4)");
                System.out.println("12 - История");
                System.out.println("0 - Выход");

                System.out.print("Выбор: ");
                int choice = scanner.nextInt();

                if (choice == 0) break;

                double a, b, result = 0;
                String record = "";

                switch (choice) {
                    case 1:
                        a = getDouble("Введите a: ");
                        b = getDouble("Введите b: ");
                        result = add(a, b);
                        record = a + " + " + b + " = " + result;
                        break;

                    case 2:
                        a = getDouble("Введите a: ");
                        b = getDouble("Введите b: ");
                        result = subtract(a, b);
                        record = a + " - " + b + " = " + result;
                        break;

                    case 3:
                        a = getDouble("Введите a: ");
                        b = getDouble("Введите b: ");
                        result = multiply(a, b);
                        record = a + " * " + b + " = " + result;
                        break;

                    case 4:
                        a = getDouble("Введите a: ");
                        b = getDouble("Введите b: ");
                        result = divide(a, b);
                        record = a + " / " + b + " = " + result;
                        break;

                    case 5:
                        a = getDouble("Введите x: ");
                        b = getDouble("Введите y: ");
                        result = Math.pow(a, b);
                        record = a + "^" + b + " = " + result;
                        break;

                    case 6:
                        a = getDouble("Введите число: ");
                        result = Math.sqrt(a);
                        record = "√" + a + " = " + result;
                        break;

                    case 7:
                        a = getDouble("Процент (a): ");
                        b = getDouble("От числа (b): ");
                        result = (a / 100) * b;
                        record = a + "% от " + b + " = " + result;
                        break;

                    case 8:
                        a = getDouble("Введите угол (в радианах): ");
                        result = Math.sin(a);
                        record = "sin(" + a + ") = " + result;
                        break;

                    case 9:
                        a = getDouble("Введите угол (в радианах): ");
                        result = Math.cos(a);
                        record = "cos(" + a + ") = " + result;
                        break;

                    case 10:
                        a = getDouble("Введите угол (в радианах): ");
                        result = Math.tan(a);
                        record = "tan(" + a + ") = " + result;
                        break;

                    case 11:
                        scanner.nextLine();
                        System.out.print("Введите выражение: ");
                        String expr = scanner.nextLine();
                        result = eval(expr);
                        record = expr + " = " + result;
                        break;

                    case 12:
                        showHistory();
                        continue;

                    default:
                        System.out.println("Неверный выбор");
                        continue;
                }

                System.out.println("Результат: " + result);
                history.add(record);

            } catch (InputMismatchException e) {
                System.out.println("Ошибка ввода!");
                scanner.nextLine();
            }
        }
    }

    public static double add(double a, double b) { return a + b; }
    public static double subtract(double a, double b) { return a - b; }
    public static double multiply(double a, double b) { return a * b; }

    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Деление на 0!");
            return 0;
        }
        return a / b;
    }

    public static double getDouble(String msg) {
        System.out.print(msg);
        return scanner.nextDouble();
    }

    public static void showHistory() {
        System.out.println("\n=== История ===");
        for (String s : history) {
            System.out.println(s);
        }
    }

    public static double eval(String expr) {
        Stack<Double> numbers = new Stack<>();
        Stack<Character> ops = new Stack<>();

        for (int i = 0; i < expr.length(); i++) {
            char c = expr.charAt(i);

            if (c == ' ') continue;

            if (Character.isDigit(c)) {
                StringBuilder sb = new StringBuilder();
                while (i < expr.length() && (Character.isDigit(expr.charAt(i)) || expr.charAt(i) == '.')) {
                    sb.append(expr.charAt(i++));
                }
                numbers.push(Double.parseDouble(sb.toString()));
                i--;
            } else if ("+-*/".indexOf(c) != -1) {
                while (!ops.isEmpty() && precedence(ops.peek()) >= precedence(c)) {
                    numbers.push(applyOp(ops.pop(), numbers.pop(), numbers.pop()));
                }
                ops.push(c);
            }
        }

        while (!ops.isEmpty()) {
            numbers.push(applyOp(ops.pop(), numbers.pop(), numbers.pop()));
        }

        return numbers.pop();
    }

    public static int precedence(char op) {
        if (op == '+' || op == '-') return 1;
        if (op == '*' || op == '/') return 2;
        return 0;
    }

    public static double applyOp(char op, double b, double a) {
        switch (op) {
            case '+': return a + b;
            case '-': return a - b;
            case '*': return a * b;
            case '/': return (b != 0) ? a / b : 0;
        }
        return 0;
    }
}