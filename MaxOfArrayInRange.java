package practice;

public class MaxOfArrayInRange {
    
    public static void main(String[] args) {
        int[]arr={17,6,47,5,9};

        System.out.println(max(arr,0,1));
    }

    public static int max(int []arr,int start,int end){
        int max=arr[0];
        for(int i=start;i<=end;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;

    }
}
