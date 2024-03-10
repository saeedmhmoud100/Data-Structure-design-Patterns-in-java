package sort;
import java.util.Arrays;
public class MargeSort {

    private static void marge(int arr[],int l,int r){

        if(l>=r)
            return;
        int mid = ((l+r)/2);

        marge(arr,l,mid);
        marge(arr,mid+1,r);

        int[] arr1 = Arrays.copyOfRange(arr,l,mid+1);
        int[] arr2 = Arrays.copyOfRange(arr,mid+1,r+1);

        int[] temp_arr = sortTwoArrays(arr1,arr2);

        // copy the sorted array
        for (int i =0 ; i<temp_arr.length;i++){
            arr[l+i] = temp_arr[i];
        }

    }

    private static int[] sortTwoArrays(int arr1[], int[] arr2){
        int arr[] = new int[arr1.length + arr2.length];
        int i=0,j=0,k=0;

        while (i<arr1.length && j<arr2.length){
            if(arr1[i] <= arr2[j]){
                arr[k] = arr1[i];
                i++;
            }else if(arr1[i] > arr2[j]){
                arr[k] = arr2[j];
                j++;
            }
            k++;
        }

        while (i<arr1.length){
            arr[k++] = arr1[i++];
        }

        while (j < arr2.length){
            arr[k++] = arr2[j++];
        }

        return arr;
    }

    public static void margeSort(int arr[]){
        // every case n*log(n)

        double c= System.currentTimeMillis();

        marge(arr,0,arr.length-1);

        c= System.currentTimeMillis() - c;
        System.out.println("this process have taken in millisecond: " +c);
    }


}
