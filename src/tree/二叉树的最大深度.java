package tree;
import java.util.*;
public class 二叉树的最大深度 {
    // 递归 dfs
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        return Math.max(maxDepth(root.right), maxDepth(root.left)) + 1;
    }
     // BFS 层序遍历
     public int maxDepth1(TreeNode root) {
         int res = 0;
         if (root == null) return res;
         Queue<TreeNode> que = new LinkedList<>();
         que.add(root);
         while (!que.isEmpty()) {
             int size = que.size();
             if (size > 0) res++;
             for (int i = 0; i < size; i++) {
                 TreeNode node;
                 node = que.peek();
                 if (node.left != null) que.add(node.left);
                 if (node.right != null) que.add(node.right);
                 que.remove();
             }
         }
         return res;
     }
}
