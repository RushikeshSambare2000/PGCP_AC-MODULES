package com.pgcp.feb26;



class BSTSubtreeCheck {
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
        }

        return current;
    }

    public boolean containsSubtree(BSTSubtreeCheck smallTree) {
        if (smallTree == null) {
            return false;
        }
        return isSubtree(this.root, smallTree.root);
    }

    private boolean isSubtree(Node bigRoot, Node smallRoot) {
        if (smallRoot == null) {
            return true;
        }
        if (bigRoot == null) {
            return false;
        }

        if (isSameTree(bigRoot, smallRoot)) {
            return true;
        }

        return isSubtree(bigRoot.left, smallRoot) || isSubtree(bigRoot.right, smallRoot);
    }

    private boolean isSameTree(Node first, Node second) {
        if (first == null && second == null) {
            return true;
        }
        if (first == null || second == null) {
            return false;
        }
        if (first.data != second.data) {
            return false;
        }

        return isSameTree(first.left, second.left) && isSameTree(first.right, second.right);
    }
    
    public void inorder() {
		inorderRecursive(root);
		System.out.println();	
	}	
	private void inorderRecursive(Node current) {
		if(current == null) {
			return;
		}
		inorderRecursive(current.left);
		System.out.print(current.data+" ");
		inorderRecursive(current.right);
			
	}  		
	public void postorder() {
		postorderRecursive(root);
		System.out.println();	
	}	
	private void postorderRecursive(Node current) {
		if(current == null) {
			return;
		}
		postorderRecursive(current.left);
		postorderRecursive(current.right);
		System.out.print(current.data+" ");
			
	}	
	public void preorder() {
		preorderRecursive(root);
		System.out.println();	
	}	
	private void preorderRecursive(Node current) {
		if(current == null) {
			return;
		}
		System.out.print(current.data+" ");
		preorderRecursive(current.left);
		preorderRecursive(current.right);
				
	}
    
}

public class BSTSubtreeCheckDemo {
    public static void main(String[] args) {
        BSTSubtreeCheck bigTree = new BSTSubtreeCheck();
//        int[] bigValues = {50, 30, 70, 20, 40, 60, 80, 65, 90};
//        for (int value : bigValues) {
//            bigTree.insert(value);
//        }
//
//        BSTSubtreeCheck smallTree = new BSTSubtreeCheck();
//        int[] smallValues = {70, 60, 80, 65};
//        for (int value : smallValues) {
//            smallTree.insert(value);
//        }
//
//        BSTSubtreeCheck notSubtree = new BSTSubtreeCheck();
//        int[] notSubtreeValues = {70, 60, 90};
//        for (int value : notSubtreeValues) {
//            notSubtree.insert(value);
//        }
//
//        System.out.println("smallTree is subtree of bigTree: " + bigTree.containsSubtree(smallTree));
//        System.out.println("notSubtree is subtree of bigTree: " + bigTree.containsSubtree(notSubtree));
        
//        int[] bigValues = {1,2,5,7,8};
//        for (int value : bigValues) {
//         bigTree.insert(value);
//        }
//        
//        System.out.println("Inorder");
//        bigTree.inorder();
//        System.out.println("Postorder");
//        bigTree.postorder();
        
        
//        BSTSubtreeCheck bigTree1 = new BSTSubtreeCheck();
//        int[] bigValues1 = {7,8,5,2,1};
//        for (int value : bigValues1) {
//         bigTree1.insert(value);
//        }
//        
//        System.out.println("Inorder");
//        bigTree1.inorder();
//        System.out.println("Postorder");
//        bigTree1.postorder();
//        System.out.println("Preorder");
//        bigTree1.preorder();
        
        /*
         * BST -->
         * preorder : A B C
         * inorder : B A C
         * 
         * right skewed:
         * preorder : A B C
         * inorder : A B C
         * postorder : C B A
         * 
         * 
         * preorder : A B D E C
         * inorder :  D B E A C
         * postorder : ?
         * 
         * preorder : A B D H I E C F G
         * INORDER : H D I B E A F C G
         * POST : H I D E B F G C A
         * 
         * 
         * PRE:  1 2 4 8 9 5 3 6 7
         * IN : 8 4 9 2 5 1 6 3 7 
         * POST : 8 9 4 5 2 6 7 3 1
         * 
         * 
         * 
         */
        
        
        
        
    }
}