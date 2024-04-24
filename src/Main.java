import Trees.BinarySearchTree.BinarySearchTree;
import Trees.BinarySearchTree.Node;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        {
            int[] arr = {3, 5, 1, 4, 2, 8, 1, 7, 3, 9, 2, 0};
            BinarySearchTree bst = new BinarySearchTree();

            for (int i = 0; i < arr.length; i++) {
                bst.insert(arr[i]);
            }


            Node y = bst.search(5);
            if (y != null) {
                System.out.println("Found: ");
            }
        }
    }
}