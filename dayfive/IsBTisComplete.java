import java.util.LinkedList;
import java.util.Queue;

class Node {
    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right = null;
    }
}

public class IsBTisComplete {
    Node root;
    boolean isComplete(Node root) {
        if (root == null)
            return true;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        boolean flag = false;
        while (!queue.isEmpty()) {
            Node tempNode = queue.remove();
            // Check left child
            if (tempNode.left != null) {
                // If we have encountered a non-full node before, this tree is not complete
                if (flag)
                    return false;
                queue.add(tempNode.left);
            } else
                // If this node doesn't have a left child, we mark it
                flag = true;

            // Check right child
            if (tempNode.right != null) {
                // If we have encountered a non-full node before, this tree is not complete
                if (flag)
                    return false;
                queue.add(tempNode.right);
            } else
                // If this node doesn't have a right child, we mark it
                flag = true;
        }

        return true;
    }

    public static void main(String[] args) {
        IsBTisComplete tree = new IsBTisComplete();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.right = new Node(6);

        if (tree.isComplete(tree.root))
            System.out.println("The binary tree is complete.");
        else
            System.out.println("The binary tree is not complete.");
    }
}
