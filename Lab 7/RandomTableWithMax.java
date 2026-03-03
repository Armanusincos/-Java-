public class RandomTableWithMax {

    public static void main(String[] args) {

        int[][] table = new int[3][5];

        // заполнение случайными числами 0–9
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                table[i][j] = (int)(Math.random() * 10);
            }
        }

        // вывод таблицы
        System.out.println("Таблица 3x5:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }

        // вызов метода
        int max = maxX(table);
        System.out.println("Максимальный элемент: " + max);
    }

    // метод поиска максимума
    public static int maxX(int[][] array) {

        int max = array[0][0]; // считаем первый элемент максимальным

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {

                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
        }

        return max;
    }
}