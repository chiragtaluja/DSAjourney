package practice;

public class OrderAgnosticBinarySearch {
    public static boolean find(int []arr){
        int start=0;
        int end=arr.length-1;
        if (arr[start]>arr[end]){
            return false;//descending
        }else {
            return true;//ascending
        }
    }
    public int binarysearch(int []arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        boolean order = find(arr);
        while (start <= end) {
            int mid = start + ((end - start) / 2);
            if (order == false) {
                if (arr[mid] > target) {
                    start = mid + 1;


                } else if (target > arr[mid]) {

                    end = mid - 1;

                } else {
                    return mid;
                }
            } else {
                if (arr[mid] < target) {
                    start = mid + 1;
                } else if (arr[mid] > target) {
                    end = mid - 1;
                } else {
                    return mid;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        OrderAgnosticBinarySearch obs = new OrderAgnosticBinarySearch();

        // Test Case 1: Ascending order, target is present
        int[] ascending = {1, 3, 5, 7, 9, 11};
        System.out.println("Test Case 1 (Ascending, target = 7): " + obs.binarysearch(ascending, 7)); // Expected: 3

        // Test Case 2: Ascending order, target not present
        System.out.println("Test Case 2 (Ascending, target = 4): " + obs.binarysearch(ascending, 4)); // Expected: -1

        // Test Case 3: Descending order, target is present
        int[] descending = {100, 80, 60, 40, 20, 0};
        System.out.println("Test Case 3 (Descending, target = 60): " + obs.binarysearch(descending, 60)); // Expected: 2

        // Test Case 4: Descending order, target not present
        System.out.println("Test Case 4 (Descending, target = 10): " + obs.binarysearch(descending, 10)); // Expected: -1

        // Test Case 5: Descending order, target is present at the end
        System.out.println("Test Case 5 (Descending, target = 0): " + obs.binarysearch(descending, 0)); // Expected: 5

        // Test Case 6: Ascending order, target is the first element
        System.out.println("Test Case 6 (Ascending, target = 1): " + obs.binarysearch(ascending, 1)); // Expected: 0

        // Test Case 7: Descending order, target is the first element
        System.out.println("Test Case 7 (Descending, target = 100): " + obs.binarysearch(descending, 100)); // Expected: 0

        // Test Case 8: Ascending order, target is the last element
        System.out.println("Test Case 8 (Ascending, target = 11): " + obs.binarysearch(ascending, 11)); // Expected: 5

    }

}


