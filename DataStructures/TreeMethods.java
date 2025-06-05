
class TreeNode {
    int value;
    TreeNode left;
    TreeNode right;

    TreeNode(int value) {
        this.value = value;
        left = null;
        right = null;
    }
}

class TreeMethods {
    public static void main(String[] args) {
        // Create a binary search tree
        TreeNode root = new TreeNode(50);
        root.left = new TreeNode(30);
        root.right = new TreeNode(70);
        root.left.left = new TreeNode(20);
        root.left.right = new TreeNode(40);
        root.right.left = new TreeNode(60);
        root.right.right = new TreeNode(80);

        // Perform common operations
        System.out.print("pre-order Traversal: ");
        preOrderTraversal(root);
        System.out.print("\nIn-order Traversal: ");
        inOrderTraversal(root);
        System.out.print("\npost-order Traversal: ");
        postOrderTraversal(root);

        System.out.println("\nSearch for value 40: " + search_new(root, 40));
        System.out.println("Search for value 90: " + search_new(root, 90));

        int minValue = findMinValue(root);
        System.out.println("Minimum value in the tree: " + minValue);

        int maxValue = findMaxValue(root);
        System.out.println("Maximum value in the tree: " + maxValue);
    }

    // pre-order traversal: root, left subtree, right subtree
    static void preOrderTraversal(TreeNode node) {
        if (node != null) {
            System.out.print(node.value + " ");
            preOrderTraversal(node.left);
            preOrderTraversal(node.right);
        }
    }

    // In-order traversal: left subtree, root, right subtree
    static void inOrderTraversal(TreeNode node) {
        if (node != null) {
            inOrderTraversal(node.left);
            System.out.print(node.value + " ");
            inOrderTraversal(node.right);
        }
    }

    // post-order traversal: root, left subtree, right subtree
    static void postOrderTraversal(TreeNode node) {
        if (node != null) {
            postOrderTraversal(node.left);
            postOrderTraversal(node.right);
            System.out.print(node.value + " ");
        }
    }

    // Search for a value in the tree
    static boolean search(TreeNode node, int value) {
        if (node == null)
            return false;
        if (node.value == value)
            return true;
        if (value < node.value)
            return search(node.left, value);
        else
            return search(node.right, value);
    }

    // Find the minimum value in the tree
    static int findMinValue(TreeNode node) {
        if (node.left == null)
            return node.value;
        return findMinValue(node.left);
    }

    // Find the maximum value in the tree
    static int findMaxValue(TreeNode node) {
        if (node.right == null)
            return node.value;
        return findMaxValue(node.right);
    }

    static boolean search_new(TreeNode root, int val) {
        if (root == null)
            return false;
        if (root.value == val)
            return true;
        else if (root.value > val)
            return search_new(root.left, val);
        else
            return search_new(root.right, val);
    }
}
