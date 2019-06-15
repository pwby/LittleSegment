package day23;

/**
 * author:byw
 */
import java.util.*;


 class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;
    }
}
public class BalanceTree {
    public boolean isBalance(TreeNode root) {
        // write code here
        if(root!=null){
            int left=treeHeight(root.left);
            int right=treeHeight(root.right);
            int differencr=Math.abs(left-right);
            if(differencr<=1){
                return true;
            }
        }
        return false;
    }
    public int treeHeight(TreeNode root){
        if(root==null){
            return 0;
        }
        if(root.left==null&&root.right==null){
            return 1;
        }
        int leftHeight=treeHeight(root.left);
        int rightHeight=treeHeight(root.right);
        return leftHeight>rightHeight?leftHeight+1:rightHeight+1;
    }
}