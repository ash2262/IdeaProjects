import java.util.Stack;

public class ReverseQ {
    public static void main(String[] args) {
        int[] A={1, 2, 3, 4, 5};
        int B=3;
        int[] output=new int[A.length];
        output=solve(A,B);
        for (int i = 0; i <A.length ; i++) {
            System.out.println(output[i]);
        }
    }
    public static int[] solve(int[] A, int B) {

        Stack<Integer> st=new Stack<>();
        int i=0;
        while ( i<B)
        {
            st.push(A[i]);
            i++;
        }
        int j=0;
        while (j<B){
            A[j]=st.pop();
            j++;
        }

        return A;
    }
}
