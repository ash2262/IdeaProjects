import java.util.Stack;

public class LargestHist {
    public static void main(String[] args) {
        int[] A={2, 1, 5, 6, 2, 3};
        System.out.println(largestRectangleArea(A));
    }

    public static int largestRectangleArea(int[] A) {
    int max_area=0;

    int[] nsl=NSL(A);
    int[] nsr=NSR(A);
    int wd=0;
    int ht=0;
    int area=0;
        for (int i = 0; i < A.length; i++) {
            wd=nsr[i]-nsl[i]-1;
            ht=A[i];
            area=wd*ht;
            max_area=Math.max(area,max_area);
        }
    return max_area;
    }
    public static int[] NSL(int[] A){
        int[] out=new int[A.length];
        Stack<Integer> stk=new Stack<Integer>();
        for (int i = 0; i <A.length ; i++) {

            while (!stk.isEmpty()&& A[stk.peek()]>=A[i]) {
                stk.pop();
            }
            if(!stk.isEmpty())
                out[i]=stk.peek();
            else
                out[i]=-1;
            stk.push(i);
            }
        return  out;
    }
    public static int[] NSR(int[] A){
        int[] out=new int[A.length];
        Stack<Integer> stk=new Stack<Integer>();
        for (int i = A.length-1; i >=0 ; i--) {

            while (!stk.isEmpty()&& A[stk.peek()]>=A[i]) {
                stk.pop();
            }
            if(!stk.isEmpty())
                out[i]=stk.peek();
            else
                out[i]=A.length;
            stk.push(i);
        }
        return  out;
    }
}
