package practice;

public class BinarySearch {
    
    public static int binarySearch(int[] arr, int target){
        int start=0;
        int end=arr.length-1;
        if(arr.length==0){
            return 0;
        }


        while(start<=end){
            int mid=(start+end)/2;
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
        return -1;
    }

    public static void main(String[] args) {
        int []arr={45 , 85 , 89 , 699 , 9669 };
        int target=699;

        int res=binarySearch(arr,target);
        System.out.println(res);
    }
}
