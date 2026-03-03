public class ProductNegativeColumns {

    public static void main(String[] args) {

        int[][] A = {
                { 1, -2, 3, -4, 5, 6 },
                { -1, 2, -3, 4, -5, 6 },
                { 7, 8, -9, 10, 11, -12 },
                { -1, 2, 3, -4, 5, 6 },
                { 1, -2, 3, 4, -5, 6 },
                { 7, 8, 9, -10, 11, 12 },
                { -1, 2, 3, 4, -5, 6 },
                { 7, -8, 9, 10, 11, -12 },
                { 1, 2, -3, 4, 5, 6 },
                { -7, 8, 9, -10, 11, 12 },
                { 1, -2, 3, 4, 5, -6 },
                { 7, 8, -9, 10, -11, 12 }
        };

        for (int j = 0; j < 6; j++) {

            long product = 1;
            boolean found = false;

            for (int i = 0; i < 12; i++) {

                if (A[i][j] < 0) {
                    product *= A[i][j];
                    found = true;
                }
            }

            if (found) {
                System.out.println("Столбец " + j + ": " + product);
            } else {
                System.out.println("Столбец " + j + ": отрицательных нет");
            }
        }
    }
}