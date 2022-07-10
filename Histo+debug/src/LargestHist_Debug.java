import java.util.Stack;

public class LargestHist_Debug {
    public static void main(String[] args) {
        int[] A={2, 1, 5, 6, 2, 3};
        System.out.println(largestRectangleArea(A));
    }
    public static int largestRectangleArea(int[] A) {
        int[] nsl = new int[A.length];
        int[] nsr = new int[A.length];

        Stack<Integer> stack = new Stack();
        for(int i=0; i<A.length; i++){
            while(!stack.isEmpty() && A[stack.peek()]>=A[i]){
                stack.pop();
            }
            if(!stack.isEmpty()){
                nsl[i] = stack.peek();
            }
            else{
                nsl[i] = -1;
            }
            stack.push(i);
        }
        stack.clear();
        for(int i=A.length-1; i>=0; i--){
            while(!stack.isEmpty() && A[stack.peek()]>=A[i]){
                stack.pop();
            }
            if(!stack.isEmpty()){
                nsr[i] = stack.peek();
            }
            else{
                nsr[i] = A.length;
            }
            stack.push(i);
        }
        int sum = 0;
        for(int i=0; i<A.length; i++){
            sum = Math.max(A[i]*Math.abs(nsr[i]-nsl[i]-1),sum);
        }
        return sum;
    }

    static int[]  nslFn( int[] A) {
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

   static int[]  nsrFn( int[] A) {
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
