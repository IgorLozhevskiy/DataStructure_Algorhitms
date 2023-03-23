import java.util.Arrays;
import java.util.Objects;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {5, 3, 1, 6, 2, 4};
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println("");
        for (int element : doBubbleSort(array)) {
            System.out.print(element + " ");
        }
        System.out.println(Arrays.toString(array));
    }


    public static int[] doBubbleSort(int[] array) {

        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int current = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = current;
                }
            }
        }
        return array;
    }

}
