public class InsertionSort {
    public static void sort(int[] arr) {
        int tmp;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                tmp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = tmp;
                int key = i;
                while (key > 0 && arr[key] < arr[key - 1]) {
                    tmp = arr[key - 1];
                    arr[key - 1] = arr[key];
                    arr[key] = tmp;
                    key--;
                }
            }
        }
        
    }
}
