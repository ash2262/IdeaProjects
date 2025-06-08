import java.util.LinkedList;
import java.util.Queue;

public class TaskScheduling {
    public static void main(String[] args) {
        //int[] A={2, 3, 1, 5, 4};
        int[] A={1};
        int[] B={1};
        System.out.println(solve(A,B));
    }
    public static int solve(int[] A, int[] B) {
        int cycles=0;
        Queue<Integer> q  = new LinkedList<>();

        for (int i = 0; i < A.length; i++) {
            q.add(A[i]);
        }

        for (int i = 0; i < B.length; i++) {
            if(q.contains(B[i])){
             while (B[i]!=q.peek()){
                 int no=q.peek();
                 q.remove();
                 cycles++;
                 q.add(no);
             }
             if(B[i]==q.peek()){
                 q.remove();
                 cycles++;
             }
            }
        }
        return  cycles;
    }
}
