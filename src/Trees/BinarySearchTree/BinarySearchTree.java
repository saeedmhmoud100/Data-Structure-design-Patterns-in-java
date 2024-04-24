package Trees.BinarySearchTree;

public class BinarySearchTree {
    Node root;

    public BinarySearchTree(){
        this.root = null;
    }

    public void insert(int data){
        root = insertRec(root, data);
    }


    public void printInOrder(){
        printInOrder(root);
    }

    public void printPreOrder(){
        printPreOrder(root);
    }

    public void printPostOrder(){
        printPostOrder(root);
    }


    public Node search(int data){
        return searchRec(root, data);
    }

    private Node searchRec(Node root, int data){
        if(root == null || root.data == data){
            return root;
        }

        if(data < root.data){
            return searchRec(root.left, data);
        } else {
            return searchRec(root.right, data);
        }

    }




    private Node insertRec(Node root, int data){
        if(root == null){
            root = new Node(data);
            return root;
        }

        if(data < root.data){
            root.left = insertRec(root.left, data);
        }else {
            root.right = insertRec(root.right, data);
        }

        return root;
    }

    private void printInOrder(Node root){
        // left, root, right

        if(root == null){
            return;
        }
        printInOrder(root.left);
        System.out.print(root.data + " ");
        printInOrder(root.right);
    }

    private void printPreOrder(Node root){
        // root, left, right

        if(root == null){
            return;
        }
        System.out.print(root.data + " ");
        printPreOrder(root.left);
        printPreOrder(root.right);
    }

    private void printPostOrder(Node root){
        // left, right, root

        if(root == null){
            return;
        }
        printPostOrder(root.left);
        printPostOrder(root.right);
        System.out.print(root.data + " ");
    }

}
