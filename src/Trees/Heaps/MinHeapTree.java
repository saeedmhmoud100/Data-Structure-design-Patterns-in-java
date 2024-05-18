package Trees.Heaps;

public class MinHeapTree {
    public void buildHeap(int[] arr, int n) {
        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[(i - 1) / 2]) {
                int j = i;
                while (arr[j] > arr[(j - 1) / 2]) {
                    swap(arr, j, (j - 1) / 2);
                    j = (j - 1) / 2;
                }
            }
        }
    }

    public void printHeap(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


}
