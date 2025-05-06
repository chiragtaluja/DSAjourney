package practice;
import java.util.Arrays;
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {45, 85, 89, 6, 9};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int end = arr.length - i - 1;
            int maxElement = getMaxElement(arr, 0, end);
                swap(arr, maxElement, end);
        }
    }
    public static int getMaxElement(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i <= end; i++) {
            if (arr[i] > arr[max]) {
                max=i;
            }
        }
        return max;
    }
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}