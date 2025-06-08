import java.util.Arrays;
import java.util.Stack;


public class SortStack {
    public static void main(String[] args) {
        int[] A={5, 17, 100, 11};
        int output[]= solve(A);
        System.out.println(Arrays.stream(output).count());
    }

    public static int[] solve(int[] A) {
        Stack<Integer> input = new Stack<Integer>();
        for (int i =0; i<A.length;i++){
            input.push(A[i]);
        }

        Stack<Integer> tmpStack = new Stack<Integer>();
        while(!input.isEmpty())
        {
// pop out the first element
            int tmp = input.pop();
//insert the bigger one first in tmpStack
            while(!tmpStack.isEmpty() && tmpStack.peek()> tmp)
            {
                input.push(tmpStack.pop());
            }

            tmpStack.push(tmp);

        }
        int [] ans = new int[tmpStack.size()];
        for (int i =0; i<tmpStack.size();i++){
            ans[i]= tmpStack.get(i);
        }
        return ans;
    }
}
