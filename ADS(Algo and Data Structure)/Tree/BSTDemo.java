class BSTDemo {
    private static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    private Node root;

    public void insert(int value) {
        root = insertRecursive(root, value);

    }

    private Node insertRecursive(Node current, int value) {

        if (current == null) {
            return new Node(value);
        }

        if (value < current.data) {
            current.left = insertRecursive(current.left, value);
        } else if (value > current.data) {
            current.right = insertRecursive(current.right, value);
        } else {
            System.out.println("Duplicates are not allowed.");
        }

        return current;
    }

    public void inorder() {
        inorderRecursive(root);
        System.out.println();

    }

    private void inorderRecursive(Node current) {

        if (current == null) {
            return;
        }

        inorderRecursive(current.left);
        System.out.print(current.data + " ");
        inorderRecursive(current.right);

    }

    public void postorder() {
        postorderRecursive(root);
        System.out.println();
    }

    private void postorderRecursive(Node current) {
        if (current == null) {
            return;
        }

        postorderRecursive(current.left);
        postorderRecursive(current.right);
        System.out.print(current.data + " ");

    }

    public void preorder() {
        preorderRecursive(root);
        System.out.println();
    }

    private void preorderRecursive(Node current) {
        if (current == null) {
            return;
        }

        System.out.print(current.data + " ");
        preorderRecursive(current.left);
        preorderRecursive(current.right);

    }

    public static void main(String args[]){

        BSTDemo tree = new BSTDemo();
        tree.insert(10);
        //tree.insert(10);
        tree.insert(5);
        tree.insert(6);
        tree.insert(13);
        tree.insert(20);
        tree.insert(50);
        tree.insert(97);

        System.out.println("Inorder Traversal : ");
        tree.inorder();
        System.out.println("Preorder Traversal : ");
        tree.postorder();
        System.out.println("Postorder Traversal : ");
        tree.preorder();
    }
}
