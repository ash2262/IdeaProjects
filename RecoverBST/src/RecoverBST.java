class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) {
        val = x;
        left=null;
        right=null;
    }
}
public class RecoverBST {
    private static TreeNode left;
    private static TreeNode right;
    private static TreeNode prev;

    public static void main(String[] args) {
        TreeNode root = new TreeNode(6);
        root.left = new TreeNode(10);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right.right = new TreeNode(12);
        root.right.left = new TreeNode(7);

        recoverTree(root);
    }

    public static int[] recoverTree(TreeNode root) {
        int[] res = new int[2];
        dfs(root);
        if (left == null) return res;
        int tmp = left.val;
        left.val = right.val;
        right.val = tmp;
        res[0] = left.val;
        res[1] = right.val;
        return res;
    }

    private static void dfs(TreeNode node) {
        if (node == null)
            return;
        dfs(node.left);
        if (prev != null) {
            if (node.val < prev.val) {
                if (left == null) {
                    left = prev;
                    right = node;
                } else {
                    right = node;
                }
            }
        }
        prev = node;
        dfs(node.right);
    }
}