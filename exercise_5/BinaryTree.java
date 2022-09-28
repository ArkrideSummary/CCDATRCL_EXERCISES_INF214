// Binary Tree in Java
public class BinaryTree {

    public static void main(String[] args) {

        // Root Node
        Node A = new Node("Rean");
        Node B = new Node("Estella");
        Node C = new Node("Joshua");
        Node D = new Node("Lloyd");
        Node E = new Node("Ellie");
        Node F = new Node("Van");
        Node G = new Node("Agnes");
        Node H = new Node("Kevin");

        A.left = B;
        A.right = C;

        B.left = D;
        B.right = E;

        C.left = F;

        D.left = H;

        F.left = G;

        System.out.print("\nIn order Traversal: ");
        traverseInOrder(A);

        System.out.print("\nPre order Traversal: ");
        traversePreOrder(A);

        System.out.print("\nPost order Traversal: ");
        traversePostOrder(A);

    }

    static void traverseInOrder(Node node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(" " + node.data);
            traverseInOrder(node.right);
        }
    }

    // Traverse Postorder method
    static void traversePostOrder(Node node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.print(" " + node.data);
        }
    }

    // Traverse Preorder method
    static void traversePreOrder(Node node) {
        if (node != null) {
            System.out.print(" " + node.data);
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }
}
