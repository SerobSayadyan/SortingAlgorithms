public class SelectionSort {
    public static void sort(int[] arr) {
        int s = 0;
        int tmp;
        
        for (int i = 0; i < arr.length; i++) {
            int min = arr[i];
            for (int j = i; j < arr.length; j++) {
                if (min > arr[j]) {
                    min = arr[j];
                    s = j;
                }
            }
            tmp = arr[i];
            arr[i] = min;
            arr[s] = tmp;
        }

    }
}
