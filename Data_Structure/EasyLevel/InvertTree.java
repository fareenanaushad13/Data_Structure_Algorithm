public class InvertTree{
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
        }
    }

static Node invertTree(Node root){
    if(root == null){
        return null;
    }

    Node temp = root.left;
    root.left = root.right;
    root.right = temp;

    invertTree(root.left);
    invertTree(root.right);

    return  root;
}

// Print tree
    static void printTree(Node root) {

        if (root == null) {
            return;
        }

        System.out.print(root.data + " ");

        printTree(root.left);
        printTree(root.right);
    }

     public static void main(String[] args) {

        // Create tree
        Node root = new Node(4);

        root.left = new Node(2);
        root.right = new Node(7);

        root.left.left = new Node(1);
        root.left.right = new Node(3);

        root.right.left = new Node(6);
        root.right.right = new Node(9);

        System.out.print("Original Tree: ");
        printTree(root);

        // Invert
        invertTree(root);

        System.out.print("\nInverted Tree: ");
        printTree(root);
    }
}