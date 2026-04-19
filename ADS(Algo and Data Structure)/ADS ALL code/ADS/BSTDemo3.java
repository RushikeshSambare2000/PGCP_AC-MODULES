public class BSTDemo3 {	
	private static class Node{
		int data ;
		Node left;
		Node right;		
		Node(int data){
			this.data = data;
		}		
	}	
	private Node root;	
	public void insert(int value) {
		root = insertRecursive(root,value);		
	}	
	private Node insertRecursive(Node current, int value) {		
		if(current == null) {
			return new Node(value);
		}
		if(value < current.data) {
			current.left = insertRecursive(current.left,value);
		} else if (value > current.data) {
			current.right = insertRecursive(current.right,value);
		}else {
			System.out.println("duplicate are not allowed.");
		}
		
		return current;
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
	
	public boolean search(int value) {
		return searchRecursive(root,value);
	}
	private boolean searchRecursive(Node current, int value) {	
		if(current==null) {
			return false;
		}		
		if(current.data == value) {
			return true;
		}		
		if (value < current.data) {
			return searchRecursive(current.left , value);
		}		
		return searchRecursive(current.right , value);		
	}
	
	
	public void delete(int value) {
		root = deleteRecursive(root, value);
		
	}
	private Node deleteRecursive(Node current, int value) {
		if(current == null) {
			return null;
		}
		if(value < current.data) {
			current.left = deleteRecursive(current.left, value);
			return current;
		}
		
		if(value > current.data) {
			current.right = deleteRecursive(current.right, value);
			//current.right = null;
			return current;
		}
		
		if(current.left == null && current.right ==null) {
			return null;
		}
		
		if(current.left == null) {
			return current.right;
		}
		
		if(current.right == null) {
			return current.left;
		}
		
		int successor = minValue(current.right);
		current.data = successor;
		current.right = deleteRecursive(current.right, successor);		
		return current;
	}
	
	
	private int minValue(Node node) {
		
		Node current = node;
		while(current.left != null) {
			current = current.left;
		}
		
		return current.data;
	}
	
	
	public int min() {
		if(root== null) {
			System.out.println("tree is empty");
		}
	
		Node current = root;
		while(current.left != null) {
			current = current.left;
		}
		return current.data;	
		
	}
	
	public int max() {
		if(root== null) {
			System.out.println("tree is empty");
		}
	
		Node current = root;
		while(current.right != null) {
			current = current.right;
		}
		return current.data;	
		
	}
	
	  public int height() {
	        return heightRecursive(root);
	    }

	    private int heightRecursive(Node current) {
	        if (current == null) {
	            return -1;
	        }
	        int leftHeight = heightRecursive(current.left);
	        int rightHeight = heightRecursive(current.right);
	        return 1 + Math.max(leftHeight, rightHeight);
	    }
	
	    public int depth(int value) {
	        Node current = root;
	        int depth = 0;

	        while (current != null) {
	            if (value == current.data) {
	                return depth;
	            }

	            if (value < current.data) {
	                current = current.left;
	            } else {
	                current = current.right;
	            }
	            depth++;
	        }

	        return -1;
	    }
	
	
	
	public static void main(String[] args) {		
		BSTDemo3  tree = new BSTDemo3();
		tree.insert(10);
		//tree.insert(10);
		tree.insert(5);
		tree.insert(6);
		tree.insert(50);
		tree.insert(13);
		tree.insert(97);
		tree.insert(20);
		//tree.insert(6);		
//		System.out.println("Inorder traversal :");
//		tree.inorder();
//		System.out.println("postorder traversal :");
//		tree.postorder();
//		System.out.println("preorder traversal :");
//		tree.preorder();	
//		
//		if(tree.search(970)) {
//			System.out.println("Data found");
//		}else {
//			System.out.println("Data not found");
//		}
		
		
	//	tree.delete(50);
		//tree.preorder();
		
		//System.out.println(tree.min());
		//System.out.println(tree.max());
		//System.out.println(tree.height());
		//System.out.println(tree.depth(200));
		
		BSTDemo3  tree1 = new BSTDemo3();
		tree1.insert(10);
		tree1.insert(20);
		tree1.insert(30);
		tree1.insert(40);
		tree1.insert(50);
		tree1.insert(60);
		tree1.insert(70);
		
		
	}
}
