import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class SlidingWindowMax {
    public static void main(String[] args) {
        List < Integer > lst=new LinkedList<>();
       /* lst.add(3);
        lst.add(2);
        lst.add(3);
        lst.add(4);
        lst.add(5);
        lst.add(5);
        lst.add(4);
        lst.add(5);
        lst.add(6);
        */
        lst.add(10);
        lst.add(1);
        lst.add(8);
        lst.add(9);
        lst.add(7);
        lst.add(6);
        lst.add(5);
        lst.add(11);
        lst.add(3);
        int b=3;
        ArrayList<Integer> ans=new ArrayList<>();
        ans=slidingMaximum(lst,b);
        for (int i = 0; i < ans.size(); i++) {
            System.out.println(ans.get(i));
        }
    }
    public static ArrayList< Integer > slidingMaximum(final List < Integer > A, int B) {
        int n = A.size();
        int i;
        ArrayList < Integer > res = new ArrayList <> ();
        int window = Math.min(A.size(), B);
        Deque<Node> deque = new LinkedList<Node>();
        int val;
        Node ans;
        for (i = 0; i < window - 1; i++) {
            val = A.get(i);
            while (!deque.isEmpty() && deque.peekFirst().val <= val) {
                deque.pollFirst();
            }
            deque.addFirst(new Node(i, val));
        }
        for (; i < n; i++) {
            val = A.get(i);
            // removes the elements not in range
            while (!deque.isEmpty() && (i - deque.peekLast().index >= window)) {
                deque.pollLast();
            }
            // removes the elements lesser than A[i]
            while (!deque.isEmpty() && deque.peekFirst().val <= val) {
                deque.pollFirst();
            }
            deque.addFirst(new Node(i, val));
            ans = deque.peekLast();
            res.add(ans.val);
        }
        return res;
    }

    static class Node {
        int val;
        int index;
        public Node(int index, int val) {
            this.index = index;
            this.val = val;
        }
    }
}
