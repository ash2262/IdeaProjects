import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class Max_rect {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> arrLst=new ArrayList<>();
    int[][] arrA= {{0,0,1},
            { 0, 1, 1},
            { 1, 1, 1}};
        for (int i = 0; i < arrA.length; i++) {
            ArrayList<Integer> row=new ArrayList<>();
            for (int j = 0; j < arrA[0].length; j++) {
                row.add(arrA[i][j]);
            }
            arrLst.add(row);
        }

        System.out.println(solve(arrLst));
    }
    public static int solve(ArrayList<ArrayList<Integer>> A) {
       // int maxArea = findMaxArea(A.get(0));
        int m,n;
        int i,j;
        m = A.size();
        n = A.get(0).size();

        int[][] count;
        count = new int[m][n];
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                if (i == 0) {
                    count[i][j] = A.get(i).get(j);
                } else {
                    count[i][j] = A.get(i).get(j) == 0 ? 0 : count[i - 1][j] + 1;
                }
            }
            //maxArea = Math.max(maxArea, findMaxArea(A.get(i)));
            maxArea = Math.max(maxArea, findMaxArea(count));
        }
        return maxArea;
    }

    private static int findMaxArea(int[][] A){
        Stack<Integer> stack = new Stack<Integer>();
        int maxArea = 0;

        for(int i=0; i<A.size(); i++)
        {
            while(stack.size()!=0 && A[i]<=A[stack.peek()])
            {
                int height = A[(stack.pop())];
                int width = stack.size()==0 ? i : i-stack.peek()-1;
                maxArea = Math.max(maxArea, width*height);
            }
            stack.push(i);
        }

        while(stack.size()!=0)
        {
            int height = A.get(stack.pop());
            int width = stack.size()==0 ? A.size() : A.size()-stack.peek()-1;
            maxArea = Math.max(maxArea, width*height);
        }
        return maxArea;
    }
}
