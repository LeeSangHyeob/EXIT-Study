https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree

public class sortedArrayToBST {

	public static void main(String[] args) {
		int[] nums = {-10,-3,0,5,9};
		sortedArrayToBST(nums);
	}
	
	public static TreeNode sortedArrayToBST(int[] nums) {
		int size = nums.length;
		return BinarySearchTree(nums, 0, size-1);
	}
	
	public static TreeNode BinarySearchTree(int[] nums, int first, int last) {
		if(first > last) return null;
		int idx = first + (last - first) / 2;
		TreeNode ans = new TreeNode(nums[idx]);
		ans.left = BinarySearchTree(nums, first, idx-1);
		ans.right = BinarySearchTree(nums, idx+1, last);
		
		return ans;
	}

}
