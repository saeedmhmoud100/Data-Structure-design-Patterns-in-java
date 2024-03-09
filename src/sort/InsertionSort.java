package sort;

public class InsertionSort {
    public static void insertionSort(int[] arr){
        //worst case n^2
        //best case n

        int i,j,key;

        for (i=1;i<arr.length;i++){
             j = i-1;
             key =arr[i];

            while (j>=0 && arr[j] > key){
                arr[j+1] = arr[j];
                j--;
            }

            arr[j+1] = key;

        }
    }

}
