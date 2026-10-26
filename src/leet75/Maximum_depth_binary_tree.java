package leet75;

import Leetcode_classes.TreeNode;

public class Maximum_depth_binary_tree {
    public int maxDepth(TreeNode root) {

        if (root == null) {
            return 0;
        } else {
            return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
        }

    }
}
