package practice;
public class BubbleSort {
    public static void main(String[] args) {
        int []arr={3,1,5,4,2};
        for(int i:bubbleSort(arr)){
            System.out.print(i+" ");
        }
    }
    public static int [] bubbleSort(int [] arr){
        for (int i=0;i<arr.length;i++){
            for (int j=1;j<arr.length-i;j++){
                if(arr[j]<arr[j-1]){
                    swap(arr,j);
                }
            }
        }
        return arr;
    }

    private static void swap(int []arr , int j) {
        int temp=arr[j];
        arr[j]=arr[j-1];
        arr[j-1]=temp;
    }
}
