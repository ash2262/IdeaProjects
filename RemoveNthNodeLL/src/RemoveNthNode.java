class ListNode {
      public int val;
      public ListNode next;
      ListNode(int x) { val = x; next = null; }
  }

public class RemoveNthNode {
    public static void main(String[] args) {
        int[] A = {1,2,3,4,5};
        ListNode head = new ListNode(A[0]);
        ListNode prev = head;
        for (int i = 1; i < A.length; i++) {
            ListNode nd = new ListNode(A[i]);
            prev.next = nd;
            prev = nd;
        }
        ListNode ans=removeNthFromEnd(head,1);
        while(ans!=null){
            System.out.println(ans.val);
            ans=ans.next;
        }
    }
    public static ListNode removeNthFromEnd(ListNode A, int B) {

        int cnt=0;
        ListNode NFromEnd=A;
        ListNode head=A;
        if(A.next==null)
            return null;
        while(A.next!=null&&A.next.next!=null)
        {
            if(cnt>=B+1)
            {
                NFromEnd=NFromEnd.next;

                    NFromEnd.next=NFromEnd.next.next;

            }
            cnt++;
            A=A.next;
        }
        return head;
    }
}
