public class RandomTable3x5 {

    public static void main(String[] args) {

        int[][] table = new int[3][5];

        // заполнение случайными числами
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                table[i][j] = (int)(Math.random() * 10);
            }
        }

        // вывод таблицы
        System.out.println("Таблица 3x5 случайных чисел:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }
    }
}