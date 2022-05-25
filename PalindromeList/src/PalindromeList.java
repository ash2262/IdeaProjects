import java.util.List;

class ListNode {
 public int val;
 public ListNode next;
 ListNode(int x) { val = x; next = null; }
}

public class PalindromeList {
    public static void main(String[] args) {
        int[] A={2,1,2,1,2,2,1,3,2,2};
        ListNode head=new ListNode(A[0]);
        ListNode prev=head;
        for (int i = 1; i < A.length; i++) {
        ListNode nd=new ListNode(A[i]);
        prev.next=nd;
        prev=nd;
        }
        System.out.println(solve(head));

    }
    static int solve(ListNode head)
    {
        int result = 0;
        ListNode prev = null, curr = head;
// loop till the end of the linked list
        while (curr != null)
        {
// The sublist from head to current
// reversed.
            ListNode next = curr.next;
            curr.next = prev;
// check for odd length
// palindrome by finding
// longest common list elements
// beginning from prev and
// from next (We exclude curr)
            result = Math.max(result,
                    2 * countCommon(prev, next)+1);
// check for even length palindrome
// by finding longest common list elements
// beginning from curr and from next
            result = Math.max(result,
                    2*countCommon(curr, next));
// update prev and curr for next iteration
            prev = curr;
            curr = next;
        }
        return result;
    }
    static int countCommon(ListNode a, ListNode b)
    {
        int count = 0;
// loop to count common in the list starting
// from node a and b
        for (; a != null && b != null;
             a = a.next, b = b.next)
// increment the count for same values
            if (a.val == b.val)
                ++count;
            else
                break;
        return count;
    }
}
