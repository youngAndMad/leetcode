package leetcode.java;

public class DeleteNodeInaBST {
    class Solution {
        public TreeNode deleteNode(TreeNode root, int key) {
            root = deleteRecursive(root, key);
            return root;
        }

        private TreeNode deleteRecursive(TreeNode root, int key) {
            if (root == null) {
                return null;
            }
            if (key < root.val) {
                root.left = deleteRecursive(root.left, key);
            } else if (key > root.val) {
                root.right = deleteRecursive(root.right, key);
            } else {
                if (root.left == null) {
                    return root.right;
                } else if (root.right == null) {
                    return root.left;
                }
                root.val = minValue(root.right);
                root.right = deleteRecursive(root.right, root.val);
            }
            return root;
        }

        private int minValue(TreeNode root) {
            int min = root.val;
            while (root.left != null) {
                min = root.left.val;
                root = root.left;
            }
            return min;
        }
    }
}
