import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class FourAlgorithm {
    public static void main(String[] args) {
        int[] sortedArray = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int key = 5;
        System.out.println("Результат работы бинарного поиска: " + doBinarySearch(sortedArray, key));
        System.out.println();
        int[] array = {5, -2, 7, -14, 2, 9, 0, 6, -32};
        System.out.println("Не сортированный массив: " + Arrays.toString(array));
        System.out.println("Пузырьковая сортировка в деле: " + Arrays.toString(doBubbleSort(array)));
        System.out.println();
        System.out.println("Сортировка выбором во плоти: " + Arrays.toString(doSelectionSort(array)));
        String[] arr = {"a", "b", "c", "d", "e"};
        System.out.println(Arrays.toString(arr));
        reverse(arr);

        System.out.println("Сортировка Вставками: "+Arrays.toString(doInsertSort(array)));
    }

    private static int[] doInsertSort(int[] array) {
        for (int i = 1; i < array.length - 1; i++) { //цикл с 2й до последней ячейки
                int current = array[i]; // переменная для значения по iтовому индексу
                int j = i -1; // переменная под предыдущий iтовый индекс
                while  (j >= 0 && array[j] > current) { //
                    // j = 2
                    // i = 9
                    array[j+1] = array[j];
                    j--;
                }

                array[j+1] = current;

            }

        return array;
    }


    private static int[] doSelectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int min = i;
            for (int j = min + 1; j < array.length; j++) {
                if (array[j] < array[i]) {
                    j = i;
                }
            }
            if (array[min] > array[i]) {
                int current = array[min];
                array[min] = array[i];
                array[i] = current;
            }
        }
        return array;
    }

    private static int[] doBubbleSort(int[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int current = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = current;
                }
            }
        }

        return array;
    }

    public static int doBinarySearch(int[] sortedArray, int key) {
        int min = 0;
        int max = sortedArray.length - 1;
        int mid;
        while (min <= max) {
            mid = min + (max - min) / 2;
            if (key > sortedArray[mid]) {
                min = mid + 1;
            } else if (key < sortedArray[mid]) {
                max = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static void reverse(String[] array) {
        int start = 0;
        int rear = array.length - 1;
        String temp;
        while (start < rear) {
            temp = array[start];
            array[start] = array[rear];
            array[rear] = temp;
            start++;
            rear--;
        }
        System.out.println(Arrays.toString(array));
    }
    /*
    array.length - 1; Это номер последнего индекса в массиве (нумерация с ноля, поэтому "-1")
    array.length; Сколько всего ячеек в массиве
    */
}

