/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    boolean result = true;;
    public boolean isBalanced(TreeNode root) {
        
        if(root == null)
            return true;
        int left = height(root.left);
        int right = height(root.right);
        if(result == false)
            return false;
        return Math.abs(left-right) > 1 ? false: true;
        
    }
    
    public int height(TreeNode node ){
        if(node == null || result == false)
            return 0;
            
        int leftHt = height(node.left);
        int rightHt = height(node.right);
        if(Math.abs(leftHt - rightHt) > 1)
            result = false;
        return Math.max(leftHt,rightHt) + 1;
    }
}
