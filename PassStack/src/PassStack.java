import java.util.Stack;

public class PassStack {
    public static void main(String[] args) {
       /*int[] c={86, 63, 60, 0, 47, 0, 99, 9, 0, 0};
       int A=10;
       int B=23;*/
        int[] c={2};
        int A=1;
        int B=1;
        System.out.println(solve(A,B,c));
    }
    public static int solve(int A, int B, int[] C) {
    int ans=B;
    int N=Math.min(A,C.length);
        Stack<Integer> stk=new Stack<Integer>();
        stk.push(B);
        for (int i = 0; i < N; i++) {
            if(C[i]!=0) {
                ans=C[i];
                stk.push(C[i]);
            }
            else {

              ans=  stk.pop();
                ans=stk.peek();
            }
            }
        return ans;
        }

    }


