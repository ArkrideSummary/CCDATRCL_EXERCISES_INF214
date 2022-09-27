// Binary Tree in Java
public class BinaryTree {

    public static void main(String[] args) {

        // Root Node
        Node Rean = new Node("Rean");
        Node Estella = new Node("Estella");
        Node Joshua = new Node("Joshua");
        Node Lloyd = new Node("Lloyd");
        Node Ellie = new Node("Ellie");
        Node Van = new Node("Van");
        Node Agnes = new Node("Agnes");
        Node Kevin = new Node("Kevin");

        Rean.left = Estella;
        Rean.right = Joshua;

        Estella.left = Lloyd;
        Estella.right = Ellie;

        Joshua.left = Van;

        Lloyd.left = Kevin;

        Van.left = Agnes;

        System.out.print("\nIn order Traversal: ");
        traverseInOrder(Rean);

        System.out.print("\nPre order Traversal: ");
        traversePreOrder(Rean);

        System.out.print("\nPost order Traversal: ");
        traversePostOrder(Rean);

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
