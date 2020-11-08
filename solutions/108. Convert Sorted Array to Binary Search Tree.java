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
    public TreeNode sortedArrayToBST(int[] nums) {
        
        return contructTree(nums, 0, nums.length - 1);
    }
    
    public TreeNode contructTree(int[] nums, int low, int hi){
        
        if(low > hi)
            return null;
        
        int mid = low + (hi - low) / 2;
        TreeNode node = new TreeNode(nums[mid]);
        
        node.left = contructTree(nums, low, mid - 1);
        node.right = contructTree(nums,mid + 1, hi);
        
        return node;
        
    }
}
