public class BinarySearch {
    public int iterativeBinarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length;
        int mid;

        while (right > left) {
            mid = left + ((right - left) / 2);

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else if (arr[mid] > target) {
                right = mid - 1;
            }
        }
        return -1;
    }

    public int recursiveBinarySearch(int[] arr, int target, int left, int right) {
        int mid = left + ((right - left) / 2);
        if (right < left) {
            return -1;
        }
        if (arr[mid] > target) {
            right = mid - 1;
            return recursiveBinarySearch(arr, target, left, right);
        } else if (arr[mid] < target) {
            left = mid + 1;
            return recursiveBinarySearch(arr, target, left, right);
        }
        return mid;
    }
}
