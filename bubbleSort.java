public class bubbleSort{
    static void bubbleSort(int[] arr){
        int n =arr.length;
      //insertion sort
        for(int)
        }
    }

    static void insertionSort(int[] arr){
        int n =arr.length;
        for(int j=i;j<n;j++){
            int key= arr[j];
            int i =j-1;
            while((i>-1)&&(arr[i]>k)){
                arr[i+1] =arr[i];
                i--;
            }
            arr[i+1]=key;
        }

    }

    static void selectionSort(int[] arr){
        int n =arr.length;
        for(int j=i;j<n;j++){
            int key= arr[j];
            int i =j-1;
            while((i>-1)&&(arr[i]>k)){
                arr[i+1] =arr[i];
                i--;
            }
            arr[i+1]=key;
        }

    }
    

    public static void main(String[] args){
        int arr={10,45,78,31,5};
        bubbleSort(arr);
        insertionSort(arr);
        selectionSort(arr);
    }
