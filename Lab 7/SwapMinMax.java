public class SwapMinMax {

    public static void main(String[] args) {

        int[] A = {
                5, -3, 12, 7, 0, 9, -8, 4, 15, 2,
                6, -1, 10, 3, 8, -5, 11, 14, 1, -2,
                13, 16, -6, 18, 20
        };

        int minIndex = 0;
        int maxIndex = 0;

        for (int i = 1; i < A.length; i++) {

            if (A[i] < A[minIndex]) {
                minIndex = i;
            }

            if (A[i] > A[maxIndex]) {
                maxIndex = i;
            }
        }

        // обмен элементов
        int temp = A[minIndex];
        A[minIndex] = A[maxIndex];
        A[maxIndex] = temp;

        System.out.println("Массив после обмена:");

        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
    }
}