import java.util.Stack;

public class NextGreater {
    public static void main(String[] args) {
    //int[] A={4, 5, 2, 10};
        int[] A={3, 2, 1};
      int[] ans=  nextGreater(A);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }
    }
    public static int[] nextGreater(int[] A) {
        int[] out=new int[A.length];
        Stack<Integer> stk=new Stack<>();
        for (int i = A.length-1; i >=0; i--) {

            while (!stk.isEmpty()&&stk.peek()<=A[i])
                stk.pop();
            if(!stk.isEmpty())
                out[i]=stk.peek();
            else
                out[i]=-1;
            stk.push(A[i]);
        }


        return out;
    }
}
