public class z3 {
    int field = 50;

    void show() {
        int local = 20;
        System.out.println("Поле класса: " + field);
        System.out.println("Локальная переменная: " + local);
    }

    public static void main(String[] args) {
        new z3().show();
    }
}
