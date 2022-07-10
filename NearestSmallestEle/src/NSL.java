import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class NSL {
    public static void main(String[] args) {
        //int[] A={4, 5, 2, 10, 8};
        int[] A={2, 1, 5, 6, 2, 3};
        int[] out=prevSmaller(A);
        for (int i = 0; i < out.length; i++) {
            System.out.println(out[i]);
        }

    }
    public static int[] prevSmaller(int[] A) {
        List<Integer> lst=new ArrayList<>();

        Stack<Integer> st=new Stack<Integer>();

        for (int i = 0; i < A.length; i++) {
            while (!st.isEmpty() && st.peek()>=A[i] ) {
                st.pop();
            }
            if(!st.isEmpty()) {
                lst.add(st.peek());
            }
            else {
                lst.add(-1);
            }
            st.push(A[i]);
        }
        return lst.stream().mapToInt(i -> i).toArray();
    }
}
