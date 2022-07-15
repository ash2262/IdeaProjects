import java.util.Stack;

public class StkAllSubArray {
    public static void main(String[] args) {
        //int[] A={2, 3, 1, 4};
        int[] A={1,3};
        System.out.println(solve(A));
    }
    public static int solve(int[] A) {
        int max=0;
        Stack<Integer> stk=new Stack<>();
        for (int i = 0; i < A.length; i++) {
            if(stk.isEmpty())
                stk.push(A[0]);

            while (!stk.isEmpty()&&stk.peek()<=A[i])
            {
                max=Math.max(max,stk.peek()^A[i]);
                stk.pop();
            }

            if(!stk.isEmpty()){
                int xor=stk.peek()^A[i];
                max=Math.max(max,xor);
            }
            stk.push(A[i]);
        }
        
        return max;
    }
}
