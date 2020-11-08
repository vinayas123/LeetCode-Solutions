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
    int count = 0;
    public int goodNodes(TreeNode root) {
        
        isGood(root, root.val);
        return count;
        
    }
    
    public void isGood(TreeNode root, int prevVal){
        if(root == null)
            return;
        if(root.val >= prevVal)
            count++;
       
        isGood(root.left, Math.max(prevVal, root.val));
        
        isGood(root.right, Math.max(prevVal, root.val));
    }
}
