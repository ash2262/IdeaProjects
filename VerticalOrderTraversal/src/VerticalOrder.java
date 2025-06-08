import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.TreeMap;
import com.sun.source.tree.Tree;

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


public class VerticalOrder {
    static int  isBalance=1;
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
        System.out.println(verticalOrderTraversal(A));
    }
    static class Pair {
        TreeNode t;
        int x;
        Pair(TreeNode t, int x) {
            this.t = t;
            this.x = x;
        }
    }
    public static ArrayList <ArrayList< Integer >> verticalOrderTraversal(TreeNode root) {
        ArrayList < ArrayList < Integer >> ans = new ArrayList < ArrayList < Integer >> ();

        ArrayList < Integer > ar = new ArrayList < Integer > ();
        if (root == null) {
            return ans;
        }

        TreeMap< Integer, ArrayList < Integer >> tm = new TreeMap < > ();
        Queue< Pair > q = new LinkedList< Pair >();
        q.add(new Pair(root, 0));

        while (!q.isEmpty()) {
            Pair p = q.poll();
            int v = p.t.val;
            int x = p.x;
            ar = new ArrayList < Integer > ();
            if (tm.containsKey(x)) {
                ar = tm.get(x);
                ar.add(v);
            } else {
                ar.add(v);
            }

            tm.put(x, ar);
            if (p.t.left != null) {
                q.add(new Pair(p.t.left, x - 1));
            }
            if (p.t.right != null) {
                q.add(new Pair(p.t.right, x + 1));
            }
        }
        for (int x: tm.keySet()) {
            ArrayList < Integer > f = tm.get(x);
            ans.add(f);
        }
        return ans;
    }

}
