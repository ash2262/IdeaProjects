import java.util.*;
public class Deque {
    public static void main(String[] args) {

    }
    public ArrayList<Integer> slidingMaximum(final List<Integer> A, int B) {
        Deque<Integer> q=new LinkedList<Integer>();
        ArrayList<Integer> ans=new ArrayList<Integer> ();
        q.add(A.get(0));
        for(int i=1;i<B;i++){
            while(!q.isEmpty() && q.peekLast()<=A.get(i)){
                q.removeLast();
            }
            q.addLast(A.get(i));
        }
        ans.add(q.peekFirst());
        for(int i=B;i<A.size();i++){
            if(q.peekFirst()==A.get(i-B)){
                q.removeFirst();
            }
            while(!q.isEmpty() && q.peekLast()<=A.get(i)){
                q.removeLast();
            }
            q.addLast(A.get(i));
            ans.add(q.peekFirst());
        }
        return ans;
    }
}
