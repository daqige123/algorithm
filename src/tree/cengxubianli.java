package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class cengxubianli {

    public class  TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;
    }


    public static ArrayList<ArrayList<Integer>> levelOrder (TreeNode root) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        Queue<TreeNode> que = new LinkedList<>();
        if (root != null) que.add(root); // 压入根节点
        while (!que.isEmpty()) {
            int size = que.size();  // 求这一层的节点数
            ArrayList<Integer> temp = new ArrayList<>();
            for (int i = 0; i < size; i++) {    // 遍历这一层的节点
                TreeNode node;
                node = que.peek();
                temp.add(node.val);    // 压入当前节点的值进入数组中
                if (node.left != null) que.add(node.left);  // 当前节点的左右子节点入队
                if (node.right != null) que.add(node.right);
                que.remove();   // 当前节点出队。
            }
            res.add(temp);
        }
        return res;
    }
    public static void main(String[] args) {

    }


}
