package tree;
import java.lang.reflect.Array;
import java.util.*;

public class erchashubianli {

    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;
    }

    public ArrayList<Integer> preOrder(TreeNode root) {
        ArrayList<Integer> res = new ArrayList<>();
        if (root == null) return res;
        TreeNode cur = root;
        Stack<TreeNode> stack = new Stack<>();
        while (cur != null || !stack.isEmpty()) {
            if (cur != null) {
                res.add(cur.val);
                stack.push(cur.right);
                cur = cur.left;
            } else {
                cur = stack.pop();
               // cur = cur.right;
            }
        }
        return res;
    }

    public ArrayList<Integer> inorder(TreeNode root) {
        ArrayList<Integer> res = new ArrayList<>();
        if (root == null) return res;
        TreeNode cur = root;
        Stack<TreeNode> stack = new Stack<>();
        while (cur != null || !stack.isEmpty()) {
            if (cur != null) {
                stack.push(cur);
                cur = cur.left;
            } else {
                cur = stack.pop();
                res.add(cur.val);
                cur = cur.right;
            }
        }
        return res;
    }

    //  这里我们是将节点值进行头插， 所以先把当前节点给装进去（这样它就在最后面了），然后遍历右子树，最后再左子树。
    public void postorder(TreeNode root, List<Integer> list) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode curr = root;
        while (!stack.isEmpty() || curr != null) {
            if (curr != null) {
                stack.push(curr);
                list.add(0, curr.val);
                curr = curr.right;
            } else {
                curr = stack.pop();
                curr = curr.left;
            }
        }
    }

    public static void main(String[] args) {

    }
}
