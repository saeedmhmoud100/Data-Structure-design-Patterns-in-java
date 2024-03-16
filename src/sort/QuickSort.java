package sort;

public class QuickSort {

    public static void quickSort(int[] arr, int left, int right){
        if(left >= right){
            return;
        }

        int j = partition(arr,left,right);
        quickSort(arr,left,j);
        quickSort(arr,j+1,right);
    }

    public static int partition(int[] arr, int left, int right){
        int pivot = arr[left];
        int j = left;
        for (int i = left+1;i<right+1;i++){
            if(arr[i] < pivot){
                j++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[left];
        arr[left] = arr[j];
        arr[j] = temp;

        return j;
    }


}
