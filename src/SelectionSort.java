import java.util.Arrays;


//    public static void main(String[] args) {
//        int[] notSortedArray = new int[6];
//        for (int i = 0; i < notSortedArray.length - 1; i++) {
//            notSortedArray[i] = (int) (Math.random() * 10);
//        }
//        System.out.println("Не сортированный массив: " + Arrays.toString(notSortedArray));
//        int[] sortedArray = doSelectionSorting(notSortedArray);
//        System.out.println("Сортированный массив: " + Arrays.toString(sortedArray));
//    }
//
//    public static int[] doSelectionSorting (int[] notSortedArray) {
//
//        for(int i = 0; i < notSortedArray.length - 1; i++) {
//            int minIndex = i;
//            for (int j = i+1; j < notSortedArray.length; j++) {
//                if (notSortedArray[j] < notSortedArray[minIndex]) {
//                    minIndex = j;
//                }
//                if (minIndex != i) {
//                    int current = notSortedArray[i];
//                    notSortedArray[i] = notSortedArray[minIndex];
//                   notSortedArray[minIndex] = current;
//                }
//            }
//        }
//        return notSortedArray;
//    }

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {9, 3, -6, -10, 5, 2, 4, 7, 7, 0};
        System.out.println("Before doSelectionSort" + Arrays.toString(array));
        SelectionSort.doSelectionSort(array);
        System.out.println("After doSelectionSort" + Arrays.toString(array));
    }

    public static int[] doSelectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int minIndex = i;
            for (int j = minIndex + 1; j < array.length; j++) {
                if (array[minIndex] > array[j]) {
                    minIndex = j;
                }
            }
            if (array[i] > array[minIndex]) {
                int current = array[i];
                array[i] = array[minIndex];
                array[minIndex] = current;
            }
        }
        return array;
    }
}
