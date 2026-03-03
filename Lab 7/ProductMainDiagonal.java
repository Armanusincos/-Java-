public class ProductMainDiagonal {

    public static void main(String[] args) {

        int[][] C = {
                { 1, -2, 3, 4, 5 },
                { 6, 7, -8, 9, 10 },
                { 11, 12, 13, -14, 15 },
                { 16, 17, 18, 19, -20 },
                { 21, 22, 23, 24, 25 }
        };

        long product = 1;
        boolean found = false;

        for (int i = 0; i < 5; i++) {

            if (C[i][i] > 0) {
                product *= C[i][i];
                found = true;
            }
        }

        if (found) {
            System.out.println("Произведение положительных элементов главной диагонали: " + product);
        } else {
            System.out.println("Положительных элементов на главной диагонали нет.");
        }
    }
}