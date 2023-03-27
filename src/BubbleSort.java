import java.util.Arrays;
import java.util.Objects;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {5, 3, 1, 6, 2, 4};
        System.out.println("Не отсортированный массив" + Arrays.toString(array));
        System.out.println("Сортированный массив" + Arrays.toString(doBubbleSort(array)));
    }

    public static int[] doBubbleSort(int[] array) {
        for (int i = array.length - 1; i > 0; i--) { // двигаться справа на лево
            for (int j = 0; j < i; j++) { //двигаться слева на право до тех пор
                                            // не включая последний индекс
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
