package Easy_difficulty;


public class SearchinaBinaryTree {
    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null) {
            return null;
        }
        if (root.val == val) {
            return root;
        }
        if (root.val > val) {
            return searchBST(root.left, val);
        }
        return searchBST(root.right, val);
    }

}

public class TreeNode {
    int val;
    Leetcode_classes.TreeNode left;
    Leetcode_classes.TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, Leetcode_classes.TreeNode left, Leetcode_classes.TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
