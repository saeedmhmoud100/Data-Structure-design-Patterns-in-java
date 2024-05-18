package Trees.Heaps;

public class Main {
    public static void main(String[] args) {
        MinHeapTree heap = new MinHeapTree();
        int[] arr = {10, 20, 15, 40, 50, 100, 25, 45};
        int n = arr.length;
        heap.buildHeap(arr, n);
        heap.printHeap(arr, n);

        heap.heapify(arr, n, 0); // Heapify the heap
        heap.printHeap(arr, n);

    }
}
