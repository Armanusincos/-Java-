public class AverageC {

    public static void main(String[] args) {

        int[] C = {
                5, 7, 3, 10, 8, 2, 9, 4, 6, 1,
                12, 14, 11, 13, 15, 16, 18, 17, 19, 20
        };

        double sum = 0;

        for (int i = 0; i < C.length; i++) {
            sum += C[i];
        }

        double average = sum / C.length;

        System.out.println("Среднее значение массива C: " + average);
    }
}