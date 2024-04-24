package Trees.BinarySearchTree;

public class BinarySearchTree {
    Node root;

    public BinarySearchTree() {
        this.root = null;
    }

    public void insert(int data) {
        root = insertRec(root, data);
    }


    public void printInOrder() {
        printInOrder(root);
    }

    public void printPreOrder() {
        printPreOrder(root);
    }

    public void printPostOrder() {
        printPostOrder(root);
    }


    public Node search(int data) {
        return searchRec(root, data);
    }


    public Node findMin() {
        return findMinRec(root);
    }

    public Node findMax() {
        return findMaxRec(root);
    }


    public void delete(int data) {
        root = deleteRec(root, data);
    }


    private Node deleteRec(Node root, int data) {

        if (root == null)
            return null;

        if (root.data > data) {
            root.left = deleteRec(root.left, data);
        } else if (root.data < data) {
            root.right = deleteRec(root.right, data);
        } else {
            // found the node to delete


            if (root.left == null && root.right == null) {// case 1: no child
                root = null;
            } else if (root.left == null && root.right != null) {// case 2: one child (right child)
                root.data = root.right.data;
                root.right = null;
            } else if (root.left != null && root.right == null) {// case 2: one child (left child)
                root.data = root.left.data;
                root.left = null;
            } else { // case 3: two children
                if (root.left != null) {
                    Node predecessor = findMaxRec(root.left);
                    root.data = predecessor.data;
                    root.left = deleteRec(root.left, predecessor.data);
                } else {
                    Node successor = findMinRec(root.right);
                    root.data = successor.data;
                    root.right = deleteRec(root.right, successor.data);
                }
            }
        }

        return root;
    }


    private Node findMaxRec(Node root) {
        if (root.right == null) {
            return root;
        }

        return findMaxRec(root.right);
    }


    private Node findMinRec(Node root) {
        if (root.left == null) {
            return root;
        }

        return findMinRec(root.left);
    }

    private Node searchRec(Node root, int data) {
        if (root == null || root.data == data) {
            return root;
        }

        if (data < root.data) {
            return searchRec(root.left, data);
        } else {
            return searchRec(root.right, data);
        }

    }

    private Node insertRec(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }

        if (data < root.data) {
            root.left = insertRec(root.left, data);
        } else {
            root.right = insertRec(root.right, data);
        }

        return root;
    }

    private void printInOrder(Node root) {
        // left, root, right

        if (root == null) {
            return;
        }
        printInOrder(root.left);
        System.out.print(root.data + " ");
        printInOrder(root.right);
    }

    private void printPreOrder(Node root) {
        // root, left, right

        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        printPreOrder(root.left);
        printPreOrder(root.right);
    }

    private void printPostOrder(Node root) {
        // left, right, root

        if (root == null) {
            return;
        }
        printPostOrder(root.left);
        printPostOrder(root.right);
        System.out.print(root.data + " ");
    }

}
