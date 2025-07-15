package Trees;

class Node {
    int data;
    Node left, right;
    
    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

class Solution {
    // Function to insert a node in a BST.
    Node insert(Node root, int Key) {
        // your code here
        if (root == null)
        root = new Node(Key);
        else if (Key < root.data)
            root.left = insert(root.left, Key);
        else if (Key > root.data)
            root.right = insert(root.right, Key);
        return root;
    }
    
    void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }
}
public class InsertBst {
    public static void main(String[] args) {
        Solution obj = new Solution();
        Node root = null;
        int[] keys = {50, 30, 70, 20, 40, 60, 80};

        for (int key : keys) {
            root = obj.insert(root, key);
        }

        System.out.print("Inorder Traversal of BST: ");
        obj.inorder(root);
    }

}
