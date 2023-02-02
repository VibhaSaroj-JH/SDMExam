public class bubbleSort{
    static void bubbleSort(int[] arr){
        int n =arr.length;
        int temp =0;
        for(int i=0;i<n;i++){
            for(int i=0;i<n;i++){
                if(arr[j-1]>arr [i]){
                    temp=  arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }

    public static void main(String[] args){
        int arr={10,45,78,31,5};
        bubbleSort(arr);
    }
}