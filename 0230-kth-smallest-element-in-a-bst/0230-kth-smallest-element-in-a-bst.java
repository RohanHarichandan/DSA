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
    public int kthSmallest(TreeNode root, int k) {
         Stack<TreeNode> st = new Stack<>();
      
      while (root != null) {
          st.push(root);
          root = root.left;
      }
          
      while (k != 0) {
          TreeNode n = st.pop();
          k--;
          if (k == 0) return n.val;
          TreeNode right = n.right;
          while (right != null) {
              st.push(right);
              right = right.left;
          }
      }
      
      return -1; // never hit if k is valid
    }
}