package practice;
//In this question , we have to find number that is equal to or greater than the target element
// We will do it by applying binary search to the question

public class CeilingOfANumber {
    public static int search(int []arr,int target){
       int start=0;
       int end=arr.length-1;
        if(target>arr[end]){
            return -1;
        }
        while(start<=end){
            int mid=start+((end-start)/2);
            if(arr[mid]<target){
                start=mid+1;
            }
            else if(arr[mid]>target){
                end=mid-1;
            }
            else{
                return mid;
            }
        }
        return start;
    }
    public static void main(String[] args) {
        int[] arr = {45, 85, 89, 699, 9669, 10000};

        // Original test
        int target1 = 1000001;
        int res1 = search(arr, target1);
        System.out.println("Target: " + target1 + " => Index: " + res1);

        // Test 2: Target less than the smallest element
        int target2 = 10;
        int res2 = search(arr, target2);
        System.out.println("Target: " + target2 + " => Index: " + res2);

        // Test 3: Target is present in the array
        int target3 = 699;
        int res3 = search(arr, target3);
        System.out.println("Target: " + target3 + " => Index: " + res3);

        // Test 4: Target lies between two elements
        int target4 = 700;
        int res4 = search(arr, target4);
        System.out.println("Target: " + target4 + " => Index: " + res4);

        // Test 5: Target is the last element
        int target5 = 10000;
        int res5 = search(arr, target5);
        System.out.println("Target: " + target5 + " => Index: " + res5);

        // Test 6: Target greater than all elements
        int target6 = 20000;
        int res6 = search(arr, target6);
        System.out.println("Target: " + target6 + " => Index: " + res6);
    }

}
