package practice;

public class MaxOfArray {
    
    public static void main(String[] args) {
        int[]arr={1,6,47,5,9};
        System.out.println(max(arr));
    }

    public static int max(int []arr){
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;

    }
}
