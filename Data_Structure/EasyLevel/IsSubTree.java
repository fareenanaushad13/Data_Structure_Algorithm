public class IsSubTree {
    
    // Check whether two trees are exactly the same
    static boolean isSameTree(Node root, Node subRoot) {

        // Both are empty
        if (root == null && subRoot == null) {
            return true;
        }

        // One is empty and the other is not
        if (root == null || subRoot == null) {
            return false;
        }

        // Values are different
        if (root.data != subRoot.data) {
            return false;
        }

        // Check left and right subtrees
        return isSameTree(root.left, subRoot.left)
                && isSameTree(root.right, subRoot.right);
    }

    // Check whether subRoot is a subtree of root
    static boolean isSubtree(Node root, Node subRoot) {

        // If root becomes null there is nowhere left to search
        if (root == null) {
            return false;
        }

        // Check if the tree starting from this node is same as subRoot
        if (isSameTree(root, subRoot)) {
            return true;
        }

        // Search in left and right subtree
        return isSubtree(root.left, subRoot)
                || isSubtree(root.right, subRoot);
    }

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static void main(String[] args) {

        Node root = new Node(3);

        root.left = new Node(4);
        root.right = new Node(5);

        root.left.left = new Node(1);
        root.left.right = new Node(2);

        Node subRoot = new Node(4);

        subRoot.left = new Node(1);
        subRoot.right = new Node(2);


        System.out.println(isSubtree(root, subRoot));
    }
}
