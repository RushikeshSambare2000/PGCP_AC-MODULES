class BasicTree {
    static class Node {
        int data;
        Node firstChild;
        Node nextSibling;

        Node(int data) {
            this.data = data;
        }
    }

    // Add child at the end of the parent's child list.
    static void addChild(Node parent, Node child) {
        if (parent.firstChild == null) {
            parent.firstChild = child;
            return;
        }

        Node current = parent.firstChild;
        while (current.nextSibling != null) {
            current = current.nextSibling;
        }
        current.nextSibling = child;
    }

    static void printParents(Node node, Node parent) {
        if (node == null) {
            return;
        }

        if (parent == null) {
            System.out.println(node.data + " -> NULL");
        } else {
            System.out.println(node.data + " -> " + parent.data);
        }

        Node child = node.firstChild;
        while (child != null) {
            printParents(child, node);
            child = child.nextSibling;
        }
    }

    static void printChildren(Node node) {
        if (node == null) {
            return;
        }

        System.out.print(node.data + " -> ");
        Node child = node.firstChild;
        while (child != null) {
            System.out.print(child.data + " ");
            child = child.nextSibling;
        }
        System.out.println();

        child = node.firstChild;
        while (child != null) {
            printChildren(child);
            child = child.nextSibling;
        }
    }

    static void printLeafNodes(Node node) {
        if (node == null) {
            return;
        }

        if (node.firstChild == null) {
            System.out.print(node.data + " ");
            return;
        }

        Node child = node.firstChild;
        while (child != null) {
            printLeafNodes(child);
            child = child.nextSibling;
        }
    }

    static void printDegrees(Node node, Node parent) {
        if (node == null) {
            return;
        }

        int degree = 0;
        Node child = node.firstChild;
        while (child != null) {
            degree++;
            child = child.nextSibling;
        }

        // if (parent != null) {
        //     degree++;
        // }

        System.out.println(node.data + " -> " + degree);

        child = node.firstChild;
        while (child != null) {
            printDegrees(child, node);
            child = child.nextSibling;
        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);

        addChild(root, n2);
        addChild(root, n3);
        addChild(n2, n4);
        addChild(n2, n5);

        System.out.println("Parents of each node:");
        printParents(root, null);

        System.out.println("Children of each node:");
        printChildren(root);

        System.out.print("Leaf nodes: ");
        printLeafNodes(root);
        System.out.println();

        System.out.println("Degrees of nodes:");
        printDegrees(root, null);
    }
}