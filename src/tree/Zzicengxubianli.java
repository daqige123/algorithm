package tree;
import java.util.*;
class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;
}

public class Zzicengxubianli {

    public ArrayList<ArrayList<Integer>> zigzagLevelOrder (TreeNode root) {
        // write code here
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        if (root == null) return res;
        Queue<TreeNode> que = new LinkedList<>();
        que.add(root);
        int flag = 1;
        while (!que.isEmpty()) {
            int size = que.size();

            ArrayList<Integer> temp = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode node = que.peek();
                temp.add(node.val);
                if (node.left != null) que.add(node.left);
                if (node.right != null) que.add(node.right);
                que.remove();
            }
            if (flag % 2 == 0) {
                Collections.reverse(temp);
            }
            res.add(temp);
            flag += 1;
        }
        return res;
    }

    public static void main(String[] args) {

    }

}
