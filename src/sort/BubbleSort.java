package sort;

public class BubbleSort {
    public static void BubbleSort(int arr[]){
        double c = System.currentTimeMillis();
        for(int i=0;i<arr.length;i++){
            for(int j = 0; j < arr.length-i-1;j++){

                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }

            }
        }
        c= System.currentTimeMillis() - c;
        System.out.println("this process have taken in millisecond: " +c);
    }

}
