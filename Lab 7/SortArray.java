import java.util.Arrays;

public class SortArray {

    public static void main(String[] args) {

        int[] B = {
                7, 3, 15, -2, 9, 0, 12, 5, -8, 4,
                10, 6, 1, 14, -5, 8, 11, 2, 13, -1,
                16, -3, 18, 20, 17
        };

        Arrays.sort(B);

        System.out.println("Отсортированный массив:");

        for (int i = 0; i < B.length; i++) {
            System.out.print(B[i] + " ");
        }
    }
}