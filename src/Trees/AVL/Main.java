package Trees.AVL;

public class Main {
    public static void main(String[] args) {
        AVLTree tree = new AVLTree();
        AVLTree.Node root = null;

        root = tree.insert(root, 10);
        root = tree.insert(root, 20);
        root = tree.insert(root, 30);
        root = tree.insert(root, 40);
        root = tree.insert(root, 50);
        root = tree.insert(root, 25);

        System.out.println("Preorder traversal of constructed tree is : ");
        tree.levelOrder(root);
    }
}
