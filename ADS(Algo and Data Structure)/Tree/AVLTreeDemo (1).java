package com.pgcp.feb26;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * AVL Tree implementation for integer values.
 *
 * What is AVL?
 * - AVL tree is a self-balancing Binary Search Tree (BST).
 * - For every node, the height difference between left and right subtree
 *   (called balance factor) is always in [-1, 0, 1].
 *
 * Why AVL?
 * - Normal BST can become skewed (like a linked list) in worst case.
 * - AVL performs rotations after insert/delete to keep height near log(n).
 * - This guarantees O(log n) search/insert/delete in worst case.
 */
class AVLTree {
    /**
     * Node stores:
     * - key: integer value
     * - left/right: child references
     * - height: cached subtree height for fast balance checks
     *
     * Height convention in this code:
     * - null node height = 0
     * - leaf node height = 1
     */
    private static class Node {
        int key;
        int height;
        Node left;
        Node right;

        Node(int key) {
            this.key = key;
            this.height = 1; // new node is initially a leaf
        }
    }

    private Node root;

    // ------------------------------------------------------------
    // Public API
    // ------------------------------------------------------------

    /**
     * Inserts key into AVL tree.
     * Duplicate keys are ignored to keep unique keys.
     */
    public void insert(int key) {
        root = insertRecursive(root, key);
    }

    /**
     * Deletes key from AVL tree if present.
     * If key does not exist, tree remains unchanged.
     */
    public void delete(int key) {
        root = deleteRecursive(root, key);
    }

    /**
     * Returns true if key is present.
     */
    public boolean search(int key) {
        Node current = root;
        while (current != null) {
            if (key == current.key) {
                return true;
            }
            current = key < current.key ? current.left : current.right;
        }
        return false;
    }

    /**
     * Inorder traversal prints sorted keys for BST.
     */
    public void inorder() {
        inorderRecursive(root);
        System.out.println();
    }

    /**
     * Preorder traversal is useful to observe root-left-right structure.
     */
    public void preorder() {
        preorderRecursive(root);
        System.out.println();
    }

    /**
     * Level order (BFS) helps visualize tree by levels.
     */
    public void levelOrder() {
        if (root == null) {
            System.out.println("(empty)");
            return;
        }

        Queue<Node> queue = new ArrayDeque<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();

            for (int i = 0; i < levelSize; i++) {
                Node node = queue.poll();
                System.out.print(node.key + "(h=" + node.height + ") ");

                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
            }
            System.out.println();
        }
    }

    /**
     * Pretty structure print using rotated tree style:
     * - right subtree printed first
     * - then node
     * - then left subtree
     */
    public void printStructure() {
        printStructureRecursive(root, 0);
    }

    /**
     * Validates AVL property across entire tree.
     * Useful for debugging or teaching.
     */
    public boolean isAVLValid() {
        return checkAVL(root) != -1;
    }

    /**
     * Shows balance factor for each node in inorder traversal.
     *
     * Balance factor (BF) = height(left) - height(right)
     * - BF > 1: left-heavy (needs rebalancing)
     * - BF = 1, 0, -1: balanced (AVL property maintained)
     * - BF < -1: right-heavy (needs rebalancing)
     *
     * Output format: key -> BF=value
     * Example: 20 -> BF=0, 50 -> BF=1
     */
    public void showBalanceFactors() {
        if (root == null) {
            System.out.println("(tree is empty)");
            return;
        }
        showBalanceRecursive(root);
    }

    /**
     * Recursive helper for showBalanceFactors().
     * Performs inorder traversal and prints key with balance factor.
     */
    private void showBalanceRecursive(Node node) {
        if (node == null) return;
        showBalanceRecursive(node.left);
        System.out.println(node.key + " -> BF=" + getBalance(node));
        showBalanceRecursive(node.right);
    }

    // ------------------------------------------------------------
    // Core AVL logic
    // ------------------------------------------------------------

    /**
     * Recursive BST insert followed by AVL rebalancing.
     *
     * Steps:
     * 1. Normal BST insertion.
     * 2. Update height of current node.
     * 3. Compute balance factor.
     * 4. If unbalanced, apply one of four rotations:
     *    LL, RR, LR, RL.
     */
    private Node insertRecursive(Node node, int key) {
        // 1) Standard BST insertion
        if (node == null) {
            return new Node(key);
        }

        if (key < node.key) {
            node.left = insertRecursive(node.left, key);
        } else if (key > node.key) {
            node.right = insertRecursive(node.right, key);
        } else {
            // duplicate key, do nothing
            return node;
        }

        // 2) Update height
        updateHeight(node);

        // 3 + 4) Rebalance if needed
        return rebalance(node, key);
    }

    /**
     * Recursive BST delete followed by AVL rebalancing.
     *
     * Deletion cases:
     * - Node with no child
     * - Node with one child
     * - Node with two children (replace by inorder successor)
     */
    private Node deleteRecursive(Node node, int key) {
        if (node == null) {
            return null;
        }

        // 1) Standard BST delete path selection
        if (key < node.key) {
            node.left = deleteRecursive(node.left, key);
        } else if (key > node.key) {
            node.right = deleteRecursive(node.right, key);
        } else {
            // 2) Found node to delete
            if (node.left == null || node.right == null) {
                // One child or no child
                Node replacement = (node.left != null) ? node.left : node.right;
                node = replacement; // can become null (leaf deletion)
            } else {
                // Two children:
                // Replace with inorder successor (smallest in right subtree)
                Node successor = minValueNode(node.right);
                node.key = successor.key;
                node.right = deleteRecursive(node.right, successor.key);
            }
        }

        // If tree had one node and it got deleted
        if (node == null) {
            return null;
        }

        // 3) Update height
        updateHeight(node);

        // 4) Rebalance after delete based on subtree balances
        int balance = getBalance(node);

        // Left heavy
        if (balance > 1) {
            // Left-Left
            if (getBalance(node.left) >= 0) {
                return rotateRight(node);
            }
            // Left-Right
            node.left = rotateLeft(node.left);
            return rotateRight(node);
        }

        // Right heavy
        if (balance < -1) {
            // Right-Right
            if (getBalance(node.right) <= 0) {
                return rotateLeft(node);
            }
            // Right-Left
            node.right = rotateRight(node.right);
            return rotateLeft(node);
        }

        return node;
    }

    /**
     * Rebalance after insertion based on insertion key direction.
     */
    private Node rebalance(Node node, int insertedKey) {
        int balance = getBalance(node);

        // LL case: inserted into left subtree of left child
        if (balance > 1 && insertedKey < node.left.key) {
            return rotateRight(node);
        }

        // RR case: inserted into right subtree of right child
        if (balance < -1 && insertedKey > node.right.key) {
            return rotateLeft(node);
        }

        // LR case: inserted into right subtree of left child
        if (balance > 1 && insertedKey > node.left.key) {
            node.left = rotateLeft(node.left);
            return rotateRight(node);
        }

        // RL case: inserted into left subtree of right child
        if (balance < -1 && insertedKey < node.right.key) {
            node.right = rotateRight(node.right);
            return rotateLeft(node);
        }

        return node;
    }

    // ------------------------------------------------------------
    // Rotations
    // ------------------------------------------------------------

    /**
     * Right rotation around y:
     *
     *      y                x
     *     / \              / \
     *    x   T3   ->      T1  y
     *   / \                  / \
     *  T1 T2                T2 T3
     */
    private Node rotateRight(Node y) {
        Node x = y.left;
        Node t2 = x.right;

        x.right = y;
        y.left = t2;

        updateHeight(y);
        updateHeight(x);

        return x;
    }

    /**
     * Left rotation around x:
     *
     *    x                   y
     *   / \                 / \
     *  T1  y      ->       x  T3
     *     / \             / \
     *    T2 T3           T1 T2
     */
    private Node rotateLeft(Node x) {
        Node y = x.right;
        Node t2 = y.left;

        y.left = x;
        x.right = t2;

        updateHeight(x);
        updateHeight(y);

        return y;
    }

    // ------------------------------------------------------------
    // Utility helpers
    // ------------------------------------------------------------

    private int height(Node node) {
        return node == null ? 0 : node.height;
    }

    /**
     * Balance factor = height(left) - height(right)
     * Positive means left-heavy, negative means right-heavy.
     */
    private int getBalance(Node node) {
        return node == null ? 0 : height(node.left) - height(node.right);
    }

    private void updateHeight(Node node) {
        node.height = 1 + Math.max(height(node.left), height(node.right));
    }

    private Node minValueNode(Node node) {
        Node current = node;
        while (current.left != null) {
            current = current.left;
        }
        return current;
    }

    private void inorderRecursive(Node node) {
        if (node == null) return;
        inorderRecursive(node.left);
        System.out.print(node.key + " ");
        inorderRecursive(node.right);
    }

    private void preorderRecursive(Node node) {
        if (node == null) return;
        System.out.print(node.key + " ");
        preorderRecursive(node.left);
        preorderRecursive(node.right);
    }

    private void printStructureRecursive(Node node, int depth) {
        if (node == null) return;

        printStructureRecursive(node.right, depth + 1);

        for (int i = 0; i < depth; i++) {
            System.out.print("    ");
        }
        System.out.println(node.key + "(b=" + getBalance(node) + ",h=" + node.height + ")");

        printStructureRecursive(node.left, depth + 1);
    }

    /**
     * Returns subtree height if valid AVL subtree, else -1.
     * This checks both BST balance constraints and structural consistency.
     */
    private int checkAVL(Node node) {
        if (node == null) return 0;

        int leftH = checkAVL(node.left);
        if (leftH == -1) return -1;

        int rightH = checkAVL(node.right);
        if (rightH == -1) return -1;

        if (Math.abs(leftH - rightH) > 1) {
            return -1;
        }

        // Optional consistency check with stored height
        int expected = 1 + Math.max(leftH, rightH);
        if (node.height != expected) {
            return -1;
        }

        return expected;
    }
}

/**
 * Plain BST without self-balancing.
 * Used to compare with AVL for learning.
 */
class PlainBST {
    private static class Node {
        int key;
        Node left;
        Node right;

        Node(int key) {
            this.key = key;
        }
    }

    private Node root;

    public void insert(int key) {
        root = insertRecursive(root, key);
    }

    private Node insertRecursive(Node node, int key) {
        if (node == null) {
            return new Node(key);
        }

        if (key < node.key) {
            node.left = insertRecursive(node.left, key);
        } else if (key > node.key) {
            node.right = insertRecursive(node.right, key);
        }

        return node;
    }

    public void delete(int key) {
        root = deleteRecursive(root, key);
    }

    private Node deleteRecursive(Node node, int key) {
        if (node == null) {
            return null;
        }

        if (key < node.key) {
            node.left = deleteRecursive(node.left, key);
            return node;
        }
        if (key > node.key) {
            node.right = deleteRecursive(node.right, key);
            return node;
        }

        if (node.left == null) {
            return node.right;
        }
        if (node.right == null) {
            return node.left;
        }

        Node successor = minValueNode(node.right);
        node.key = successor.key;
        node.right = deleteRecursive(node.right, successor.key);
        return node;
    }

    private Node minValueNode(Node node) {
        Node current = node;
        while (current.left != null) {
            current = current.left;
        }
        return current;
    }

    public void inorder() {
        inorderRecursive(root);
        System.out.println();
    }

    private void inorderRecursive(Node node) {
        if (node == null) return;
        inorderRecursive(node.left);
        System.out.print(node.key + " ");
        inorderRecursive(node.right);
    }

    public void preorder() {
        preorderRecursive(root);
        System.out.println();
    }

    private void preorderRecursive(Node node) {
        if (node == null) return;
        System.out.print(node.key + " ");
        preorderRecursive(node.left);
        preorderRecursive(node.right);
    }

    public void printStructure() {
        printStructureRecursive(root, 0);
    }

    private void printStructureRecursive(Node node, int depth) {
        if (node == null) return;

        printStructureRecursive(node.right, depth + 1);
        for (int i = 0; i < depth; i++) {
            System.out.print("    ");
        }
        System.out.println(node.key);
        printStructureRecursive(node.left, depth + 1);
    }

    public int height() {
        return heightRecursive(root);
    }

    private int heightRecursive(Node node) {
        if (node == null) return 0;
        return 1 + Math.max(heightRecursive(node.left), heightRecursive(node.right));
    }

    public boolean isHeightBalanced() {
        return checkBalance(root) != -1;
    }

    private int checkBalance(Node node) {
        if (node == null) return 0;

        int left = checkBalance(node.left);
        if (left == -1) return -1;

        int right = checkBalance(node.right);
        if (right == -1) return -1;

        if (Math.abs(left - right) > 1) {
            return -1;
        }

        return 1 + Math.max(left, right);
    }
}

public class AVLTreeDemo {
    public static void main(String[] args) {
        // --------------------------------------------------------
        // Example 1: LL case
        // Insert sequence: 30, 20, 10
        // Without balancing, 30 would become left-heavy chain.
        // AVL performs one right rotation.
        // --------------------------------------------------------
      /*  int[] llValues = {30, 20, 10};

        PlainBST llPlainTree = new PlainBST();
        AVLTree llTree = new AVLTree();
        for (int x : llValues) {
            llPlainTree.insert(x);
            llTree.insert(x);
        }

        System.out.println("Example 1 - LL rotation");
        System.out.println("Before AVL (normal BST):");
        System.out.print("Inorder: ");
        llPlainTree.inorder();
        System.out.print("Preorder: ");
        llPlainTree.preorder();
        llPlainTree.printStructure();
        System.out.println("Height balanced: " + llPlainTree.isHeightBalanced() + ", Height: " + llPlainTree.height());

        System.out.println("After AVL balancing:");
        System.out.print("Inorder: ");
        llTree.inorder();
        System.out.print("Preorder: ");
        llTree.preorder();
        llTree.printStructure();
        System.out.println("AVL valid: " + llTree.isAVLValid());
        System.out.println();
	*/
        // --------------------------------------------------------
        // Example 2: RR case
        // Insert sequence: 10, 20, 30
        // AVL performs one left rotation.
        // --------------------------------------------------------
        int[] rrValues = {10, 20, 30};

      //  PlainBST rrPlainTree = new PlainBST();
        AVLTree rrTree = new AVLTree();
        for (int x : rrValues) {
          //  rrPlainTree.insert(x);
            rrTree.insert(x);
        }

        System.out.println("Example 2 - RR rotation");
        System.out.println("Before AVL (normal BST):");
        System.out.print("Inorder: ");
       // rrPlainTree.inorder();
        System.out.print("Preorder: ");
      //  rrPlainTree.preorder();
       // rrPlainTree.printStructure();
       // System.out.println("Height balanced: " + rrPlainTree.isHeightBalanced() + ", Height: " + rrPlainTree.height());

        System.out.println("After AVL balancing:");
        System.out.print("Inorder: ");
        rrTree.inorder();
        System.out.print("Preorder: ");
        rrTree.preorder();
        rrTree.printStructure();
        System.out.println("AVL valid: " + rrTree.isAVLValid());
        System.out.println();

        // --------------------------------------------------------
        // Example 3: LR case
        // Insert sequence: 30, 10, 20
        // Fix requires:
        // 1) Left rotation on left child
        // 2) Right rotation on root
        // --------------------------------------------------------
        int[] lrValues = {30, 10, 20};

        PlainBST lrPlainTree = new PlainBST();
        AVLTree lrTree = new AVLTree();
        for (int x : lrValues) {
            lrPlainTree.insert(x);
            lrTree.insert(x);
        }

        System.out.println("Example 3 - LR rotation");
        System.out.println("Before AVL (normal BST):");
        System.out.print("Inorder: ");
        lrPlainTree.inorder();
        System.out.print("Preorder: ");
        lrPlainTree.preorder();
        lrPlainTree.printStructure();
        System.out.println("Height balanced: " + lrPlainTree.isHeightBalanced() + ", Height: " + lrPlainTree.height());

        System.out.println("After AVL balancing:");
        System.out.print("Inorder: ");
        lrTree.inorder();
        System.out.print("Preorder: ");
        lrTree.preorder();
        lrTree.printStructure();
        System.out.println("AVL valid: " + lrTree.isAVLValid());
        System.out.println();

        // --------------------------------------------------------
        // Example 4: RL case
        // Insert sequence: 10, 30, 20
        // Fix requires:
        // 1) Right rotation on right child
        // 2) Left rotation on root
        // --------------------------------------------------------
        int[] rlValues = {10, 30, 20};

        PlainBST rlPlainTree = new PlainBST();
        AVLTree rlTree = new AVLTree();
        for (int x : rlValues) {
            rlPlainTree.insert(x);
            rlTree.insert(x);
        }

        System.out.println("Example 4 - RL rotation");
        System.out.println("Before AVL (normal BST):");
        System.out.print("Inorder: ");
        rlPlainTree.inorder();
        System.out.print("Preorder: ");
        rlPlainTree.preorder();
        rlPlainTree.printStructure();
        System.out.println("Height balanced: " + rlPlainTree.isHeightBalanced() + ", Height: " + rlPlainTree.height());

        System.out.println("After AVL balancing:");
        System.out.print("Inorder: ");
        rlTree.inorder();
        System.out.print("Preorder: ");
        rlTree.preorder();
        rlTree.printStructure();
        System.out.println("AVL valid: " + rlTree.isAVLValid());
        System.out.println();

        // --------------------------------------------------------
        // Example 5: Mixed realistic dataset + deletions
        // Demonstrates balancing in larger tree and delete rebalancing.
        // --------------------------------------------------------
        int[] mixedValues = {50, 30, 70, 20, 40, 60, 80, 65, 10, 35, 45, 75, 85};

        PlainBST mixedPlainTree = new PlainBST();
        AVLTree mixedTree = new AVLTree();
        for (int x : mixedValues) {
            mixedPlainTree.insert(x);
            mixedTree.insert(x);
        }

        System.out.println("Example 5 - Mixed insertions");
        System.out.println("Before AVL (normal BST):");
        System.out.print("Inorder (sorted): ");
        mixedPlainTree.inorder();
        System.out.print("Preorder: ");
        mixedPlainTree.preorder();
        mixedPlainTree.printStructure();
        System.out.println("Height balanced: " + mixedPlainTree.isHeightBalanced() + ", Height: " + mixedPlainTree.height());

        System.out.println("After AVL balancing:");
        System.out.print("Inorder (sorted): ");
        mixedTree.inorder();
        System.out.println("Balance factors for each node:");
        mixedTree.showBalanceFactors();
        System.out.println("Level order with heights:");
        mixedTree.levelOrder();
        mixedTree.printStructure();
        System.out.println("AVL valid: " + mixedTree.isAVLValid());

        System.out.println("\nDeleting 70, 30, 50 (includes node with two children)");
        mixedPlainTree.delete(70);
        mixedPlainTree.delete(30);
        mixedPlainTree.delete(50);
        mixedTree.delete(70);
        mixedTree.delete(30);
        mixedTree.delete(50);

        System.out.println("After delete - normal BST:");
        System.out.print("Inorder after delete: ");
        mixedPlainTree.inorder();
        mixedPlainTree.printStructure();
        System.out.println("Height balanced after delete: " + mixedPlainTree.isHeightBalanced() + ", Height: " + mixedPlainTree.height());

        System.out.println("After delete - AVL tree:");
        System.out.print("Inorder after delete: ");
        mixedTree.inorder();
        System.out.println("Level order after delete:");
        mixedTree.levelOrder();
        mixedTree.printStructure();
        System.out.println("AVL valid after delete: " + mixedTree.isAVLValid());

        // Extra quick checks
        System.out.println("\nSearch 65: " + mixedTree.search(65));
        System.out.println("Search 999: " + mixedTree.search(999));
    }
}
