public class TreeImplementation {
    private Node root;

    private static class Node{
        Node left;
        Node right;
        int data;

        Node(int data){
            this.data=data;
        }
    }


    public void insert(int value){
        root= InsertRecursive(root,value);
    }

    private Node InsertRecursive(Node current, int value){
        if(current == null){
            return new Node(value);
        }
        if(value < current.data){
            current.left=InsertRecursive(current.left, value);
        }else if(value>current.data){
            current.right=InsertRecursive(current.right, value);
        }else{
            System.out.println("Duplicate are not allowed");
        }
        return current;
    }

    public void inorder(){
             inorderRecursive(root);
             System.out.println();
    }
     public void inorderRecursive(Node current){
        if(current==null){
            return;
        }
        inorderRecursive(current.left);
        System.out.println(current.data);
        inorderRecursive(current.right);
    }


     public void postorder(){
             postorderRecursive(root);
             System.out.println();
    }
     public void postorderRecursive(Node current){
        if(current==null){
            return;
        }
        postorderRecursive(current.left);
        postorderRecursive(current.right);
        System.out.println(current.data);
    }


       public void preorder(){
             preorderRecursive(root);
             System.out.println();
    }
     public void preorderRecursive(Node current){
        if(current==null){
            return;
        }
        System.out.println(current.data);
        preorderRecursive(current.left);
        preorderRecursive(current.right);
       
    }
        
    public static void main(String[] args) {
        TreeImplementation tree = new TreeImplementation();
        tree.insert(10);
        tree.insert(20);
        tree.insert(5);
        tree.insert(40);
        tree.insert(3);
        tree.insert(60);
        tree.insert(70);
        tree.insert(2);
        tree.preorder();
        tree.inorder();
        tree.postorder();
      

    }
}
