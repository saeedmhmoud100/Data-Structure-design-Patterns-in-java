import static sort.InsertionSort.insertionSort;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class Main {
    public static void main(String[] args) {
        {


            int[] arr = {5,3,4,8,4,3,4,7,1};
            insertionSort(arr);

//            for(int i=0;i<1001;i++)
//                System.out.print(i + ",");
            for(int i=0;i<arr.length;i++)
                System.out.print(arr[i] + ", ");
        }
    }



}