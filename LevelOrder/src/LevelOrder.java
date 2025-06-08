import java.util.*;

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

public class LevelOrder {
    public static void main(String[] args) {
        int[] Arr={3, 2, 1};

        TreeNode A=new TreeNode(3);
        A.left=new TreeNode(2);

        A.right=new TreeNode(1);
        A.left.left=new TreeNode(3);
        A.left.right=new TreeNode(4);
        A.right.left=new TreeNode(5);
        A.right.right=new TreeNode(6);
        A.right.right.left=new TreeNode(7);
        A.right.right.right=new TreeNode(8);
        System.out.println(levelOrder(A));
    }
    static class Pair {
        TreeNode t;
        int x;
        Pair(TreeNode t, int x) {
            this.t = t;
            this.x = x;
        }
    }
    public static ArrayList<ArrayList<Integer>> levelOrder(TreeNode A) {
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        if(A==null) return ans;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(A);
        while(!q.isEmpty()){
            ArrayList<Integer> tmp=new ArrayList<>();
            int size=q.size();
            for(int i=0;i<size;i++){
                TreeNode x=q.remove();
                tmp.add(x.val);
                if(x.left!=null){
                    q.add(x.left);
                }
                if(x.right!=null){
                    q.add(x.right);
                }
            }
            ans.add(tmp);
        }
        return ans;
    }
}
