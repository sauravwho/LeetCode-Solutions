/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    private int res = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        findDepth(root);
        return res;
    }
    private int findDepth(TreeNode root){
        if(root == null) return 0;
        int leftDepth = findDepth(root.left);
        int rightDepth = findDepth(root.right);
        res = Math.max(res, leftDepth + rightDepth);
        return Math.max(leftDepth, rightDepth)+1;
    }
}