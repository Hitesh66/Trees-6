//Time Complexity O(N)
//Space Complexity O(N)
//Leetcode tested

import java.util.LinkedList;
import java.util.Queue;
public class RangeSumOfBST {
    public int rangeSumBST(TreeNode root, int low, int high) {
        int sum = 0;
        if(root == null){
            return sum;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            TreeNode current = queue.remove();
            if(current.val >= low && current.val<=high) sum+= current.val;
            if(current.left!=null && current.val>low) queue.add(current.left);
            if(current.right!=null && current.val<high) queue.add(current.right);
        }
        return sum;
    }
}