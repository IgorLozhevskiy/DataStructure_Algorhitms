public class Main {
    public static void main(String[] args) {

        int[] sortedArray = {-12, -4, -2, 0, 2, 5, 6, 8, 13, 17, 20, 23};
        int key = 100;
        BinarySearch binarySearch = new BinarySearch();
       int result =  binarySearch.binarySearchFunction(sortedArray,key);
        System.out.println(result);
    }

}
