package sort;

public class SelectionSort {
    // every case n^2

    public static void SelectionSort(int arr[]){

        double c= System.currentTimeMillis();

        int i,j,min_index;

        for (i = 0; i < arr.length; i++){
            min_index=i;

            for ( j = i+1; j < arr.length; j++){
                if(arr[j] < arr[min_index]){
                    min_index = j;
                }
            }

            int temp = arr[min_index];

            arr[min_index] = arr[i];

            arr[i] = temp;

        }


        c= System.currentTimeMillis() - c;
        System.out.println("this process have taken in millisecond: " +c);
    }
}
