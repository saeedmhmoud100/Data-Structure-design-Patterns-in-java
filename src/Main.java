import Trees.BinarySearchTree.BinarySearchTree;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        {
            int[] arr = {3,5,1,4,2};
            BinarySearchTree bst = new BinarySearchTree();

            for (int i = 0; i < arr.length; i++){
                bst.insert(arr[i]);
            }

            bst.printPreOrder();
            System.out.print("\n");
            bst.printInOrder();
            System.out.print("\n");
            bst.printPostOrder();


        }
    }



}