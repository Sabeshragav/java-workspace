import java.util.*;

// Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class chk {
    public static List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> iArr = new ArrayList<>();

        inOrderHelper(root, iArr);
        return iArr;
    }

    public static void inOrderHelper(TreeNode root, ArrayList<Integer> iArr) {
        if (root != null) {
            inOrderHelper(root.left, iArr);
            iArr.add(root.val);
            inOrderHelper(root.right, iArr);
        }
    }

    public static void main(String[] args) {
        chk ob = new chk();
        TreeNode root = new TreeNode(50);
        root.left = new TreeNode(30);
        root.right = new TreeNode(70);
        root.left.left = new TreeNode(20);
        root.left.right = new TreeNode(40);
        root.right.left = new TreeNode(60);
        root.right.right = new TreeNode(80);
        System.out.println(inorderTraversal(root));

    }
}