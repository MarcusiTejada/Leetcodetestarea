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

/*
*
    Approach: recursive DFS, 1 + max of left and right subtree depths
    Time: O(n) | Space: O(h)
    Runtime: 0 ms, beats 100.00% | Memory: 46.77 MB, beats 90.74%
*
* */
