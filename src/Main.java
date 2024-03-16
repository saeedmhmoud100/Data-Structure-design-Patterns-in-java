import java.util.Scanner;

import static sort.QuickSort.quickSort;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class Main {
    public static void main(String[] args) {
        {
            int[] arr = {3,5,1,4,2};
            quickSort(arr,0,4);
//            for(int i=0;i<1001;i++)
//                System.out.print(i + ",");
            for(int i=0;i<arr.length;i++)
                System.out.print(arr[i] + ", ");
        }
    }



}