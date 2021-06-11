package DFS;
class TreeNode {
    int val;
    TreeNode right;
    TreeNode left;
    TreeNode () {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;
    }
    TreeNode (int val, TreeNode left, TreeNode right){
        this.val = val;
        this.right = right;
        this.left = left;
    }
}

public class 最近公共祖先 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null || root == p || root == q) return root;
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        if(left == null) return right;
        if(right == null) return left;
        return root;
    }

}
