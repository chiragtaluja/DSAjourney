package practice;

public class PositionOfElementInSortedArrayOfInfiniteNumbers {
    public static int search(int []arr,int target){
        int start=0;
        int end=1;

        while(target>arr[end]){
            int newStart=end+1;
            end = end + (end - start + 1) * 2;
            start=newStart;
        }
        while(start<=end){
            int mid=start+((end-start)/2);

            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]>target){
                end=mid-1;
            }
            else if(arr[mid]<target) {
                start = mid + 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = new int[1000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * 3; // Sorted multiples of 3
        }

        int target1 = 123; // Present
        int target2 = 124; // Not present
        int target3 = 0;   // First element
        int target4 = arr[999]; // Last element

        System.out.println("Test 1 → Target " + target1 + " found at index: " + search(arr, target1));
        System.out.println("Test 2 → Target " + target2 + " found at index: " + search(arr, target2));
        System.out.println("Test 3 → Target " + target3 + " found at index: " + search(arr, target3));

    }
}

