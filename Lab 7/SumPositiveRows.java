public class SumPositiveRows {

    public static void main(String[] args) {

        int[][] B = {
                { 1, -2, 3, 4, -5 },
                { -1, 2, -3, 4, 5 },
                { 6, -7, 8, -9, 10 },
                { -1, -2, 3, 4, 5 },
                { 1, 2, -3, -4, 5 }
        };

        int[] A = new int[5];

        for (int i = 0; i < 5; i++) {

            int rowSum = 0;

            for (int j = 0; j < 5; j++) {
                if (B[i][j] > 0) {
                    rowSum += B[i][j];
                }
            }

            A[i] = rowSum;
        }

        System.out.println("Суммы положительных элементов по строкам:");

        for (int i = 0; i < 5; i++) {
            System.out.println("Строка " + i + ": " + A[i]);
        }
    }
}