public class BinarySearch {

    // this algorithm is working  only sorted array
    // {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11} -> 11 cells, 10 index
    // low, mid, high
    public int binarySearchFunction(int[] array, int key) {
        int low = 0; // first index in array
        int high = array.length - 1; // last index in array

        while (low <= high) { // this condition so than without "Array Auto Bound Exception"
            int mid = low + (high - low) / 2;
            if (key == array[mid]) { // O(1)
                return mid;
            } else if (array[mid] < key) { // go to the RIGHT array part
                low = mid + 1;
            } else if (array[mid] > key) { // go to the LEFT array part
               high = mid - 1;
            }
        }
        return -1;
    }
}
