https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        
        if(root == null) return null;
        else if(root.val == p.val || root.val == q.val){
            return root;
        }
        
        TreeNode lTree = lowestCommonAncestor(root.left, p, q);
        TreeNode rTree = lowestCommonAncestor(root.right, p, q);
        
        if(lTree != null && rTree != null){
            return root;
        } else if(lTree != null){
            return lTree;
        } else {
            return rTree;
        }
    }
}
