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
    int max = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null)
            return 0;
        int height = calculateHeight(root.left) + calculateHeight(root.right);
        return  height > max ? height : max;
    }
    
    public int calculateHeight(TreeNode node){
        if(node == null)
            return 0;
        int leftHt = calculateHeight(node.left);
        int rightHt = calculateHeight(node.right);
        
        if(leftHt + rightHt > max)
            max = leftHt + rightHt;
        
        return Math.max(leftHt, rightHt) + 1;
    }
}
