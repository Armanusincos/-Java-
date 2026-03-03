public class SumEvenOddD {

    public static void main(String[] args) {

        int[] D = {
                1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
                11, 12, 13, 14, 15, 16, 17, 18, 19, 20,
                21, 22, 23, 24, 25, 26, 27, 28, 29, 30
        };

        int sumEven = 0;
        int sumOdd = 0;

        for (int i = 0; i < D.length; i++) {

            if (D[i] % 2 == 0) {
                sumEven += D[i];
            } else {
                sumOdd += D[i];
            }
        }

        System.out.println("Сумма чётных элементов: " + sumEven);
        System.out.println("Сумма нечётных элементов: " + sumOdd);
    }
}