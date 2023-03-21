import java.util.Arrays;

public class Training {

    public static void main(String[] args) {
        int[] array = {5, 3, 1, 6, 2, 4};
        Arrays.sort(array);
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println(" ");
        int key = -1231231;
        System.out.println(doBinarySearching(array, key));
    }

    public static int doBinarySearching(int[] array, int key) {
        int first = 0;
        int last = array.length - 1;
        while (first <= last) {
            int mid = first + (last - first) / 2;
            if (key == array[mid]) {
                return mid;
            } else if (key < array[mid]) { //ключ в левой части
                last = mid - 1;
            } else if (key > array[mid]) {
                first = mid + 1;
            }
        }
        throw new IllegalArgumentException("This key doesn't found");
//        return -1;
    }
}
