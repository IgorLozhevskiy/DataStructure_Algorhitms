public class RecursionBinarySearch {

    public int recursionBinarySearchFunction(int[] array, int key) {
        int low = 0;
        int high = array.length - 1;
        return recursion(array, key, low, high);
    }

    private int recursion(int[] array, int key, int low, int high) {
        int mid = low + (high - low) / 2;
        if (low <= high) {
            if (array[mid] == key) {
                return mid;
            } else if (array[mid] < key) {
                return recursion(array, key, mid + 1, high);
            } else if (array[mid] > key) {
                return recursion(array, key, low, mid - 1);
            }
            return mid;
        }
        return -1;
    }

}
