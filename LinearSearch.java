package practice;

public class LinearSearch {
    
    static int search(int[]arr,int target){
        if (arr.length==0){
            return -1;
        }
        for(int i=0;i<arr.length;i++){
            if (arr[i]==target){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int []arr={};
        int target=47;
        int result =search(arr,target);
        if(result==-1){
            System.out.println("Element not found");
        }
        else{
            System.out.println("Element found at index : "+(result+1) );
        }
    }
}
