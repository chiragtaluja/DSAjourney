package practice;

public class BinarySearch{
    int binarySearch(int [] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + ((end - start) / 2);
            if (arr[mid] == target) {
                return mid;
            }
            if (arr[mid] > target) {
                end = mid - 1;
            }
            if (arr[mid] < target) {
                start = mid + 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        BinarySearch bs = new BinarySearch();
        int[] arr = {1, 3, 5, 7, 9, 11};
        int target = 7;
        int result = bs.binarySearch(arr, target);
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found.");
        }
}
}