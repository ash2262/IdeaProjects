import java.util.Stack;


public class Histo_debug {
    public  void main(String[] args) {
        int[] A={2, 1, 5, 6, 2, 3};
        System.out.println(largestRectangleArea(A));
    }


    public  int largestRectangleArea(int[] A) {
        int[] nsl = nslFn( A );
        int[] nsr = nsrFn( A );
        int maxArea = 0;

        for(int i=0; i < A.length; i++) {
            int currentArea = (nsr[i] - nsl[i] -1) * A[i];
            maxArea = Math.max( maxArea, currentArea );
        }

        return maxArea;
    }

    int[] nslFn( int[] A) {
        int[] ans = new int [A.length];
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);

        for(int i=0; i < A.length; i++) {
            while( stack.peek() != -1 && A[i] <= A[stack.peek()] ) stack.pop();

            ans[i] = stack.peek();
            stack.push(i);
        }
        return ans;
    }

    int[] nsrFn( int[] A) {
        int[] ans = new int [A.length];
        Stack<Integer> stack = new Stack<>();
        stack.push( A.length );

        for(int i=A.length-1; i >=0; i--) {
            while( stack.peek() != A.length && A[i] <= A[stack.peek()] ) stack.pop();

            ans[i] = stack.peek();
            stack.push(i);
        }
        return ans;
    }

}
