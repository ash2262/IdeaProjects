class ListNode {
    public int val;
    public ListNode next;
    ListNode(int x) { val = x; next = null; }
}

public class DeleteDuplicates {
    public static void main(String[] args) {

        int[] A = {2, 1, 2, 1, 2, 2, 1, 3, 2, 2};
        ListNode head = new ListNode(A[0]);
        ListNode prev = head;
        for (int i = 1; i < A.length; i++) {
            ListNode nd = new ListNode(A[i]);
            prev.next = nd;
            prev = nd;
        }
        ListNode ansLL;
        ansLL= deleteDuplicates(head);
        while (ansLL!=null){
            System.out.println(ansLL.val);
            ansLL=ansLL.next;
        }
    }
    public static ListNode deleteDuplicates(ListNode A) {
    ListNode head=A;
        while ( A.next!=null) {
            if(A.val==A.next.val)
            {
                A.next=A.next.next;
            }
            else{
                A=A.next;
            }
        }
        return head;
    }
}


