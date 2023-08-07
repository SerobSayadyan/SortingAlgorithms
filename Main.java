public class Main {
    public static void main(String[] args) {
        //Searching algorithms
        int[] sortedArr = {1,3,4,5,6,7,8,9,10,11,12,13,14,200,454,844,1000,1021,1500};
//        System.out.println(new BinarySearch().iterativeBinarySearch(sortedArr, 1500));
//        System.out.println(new BinarySearch().recursiveBinarySearch(sortedArr, 1500, 0, sortedArr.length - 1));

        //Sorting algorithms
        int[] nums = {21,54,154,471,1,2,666,5,7899,1,654,21};
//        BubbleSort.sort(nums);
        SelectionSort.sort(nums);
//        InsertionSort.sort(nums);
    }
}