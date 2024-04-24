import Trees.BinarySearchTree.BinarySearchTree;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        {
            int[] arr = {3,5,1,4,2,8,1,7,3,9,2,0};
            BinarySearchTree bst = new BinarySearchTree();

            for (int i = 0; i < arr.length; i++){
                bst.insert(arr[i]);
            }


            bst.delete(1);
            bst.delete(3);
            bst.delete(2);

            bst.printInOrder();
        }
    }



}