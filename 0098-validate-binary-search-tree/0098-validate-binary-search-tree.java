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
    public boolean isValidBST(TreeNode root) {
        
        return validBst(root,Long.MIN_VALUE,Long.MAX_VALUE);
        
    }
    public static boolean validBst(TreeNode root,long minval,long maxval){
        if(root==null){
            return true;
        }
        if(root.val<=minval || root.val>=maxval){
            return false;
        }
        return (validBst(root.left,minval,root.val) && validBst(root.right,root.val,maxval));
    }
}