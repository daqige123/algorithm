import java.util.*;
class TreeNode {
    int val = 0;
    TreeNode right = null;
    TreeNode left = null;
}

class Main {
    public static void main(String[] args) {

    }
    public static List<List<Integer>> level (TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) return res;
        Queue<TreeNode> que = new LinkedList<>();
        que.add(root);
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
            res.add(temp);
        }
        Collections.reverse(res);
        return res;
    }
}