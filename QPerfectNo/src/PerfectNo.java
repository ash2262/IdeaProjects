import java.util.LinkedList;
import java.util.Queue;

public class PerfectNo {
    public static void main(String[] args) {
        System.out.println(solve(9));
    }
    public static String solve(int A) {
        String output=null;
        Queue<String> q=new LinkedList<>();
        int[] arr=new int[]{1,2};
        String prev1=null;
        String prev2=null;

        for (int i = 0; i <= A; i++) {
            if (q.isEmpty()) {
                q.add(Integer.toString(arr[0]) + Integer.toString(arr[0]));
                q.add(Integer.toString(arr[1]) + Integer.toString(arr[1]));
                prev1 = Integer.toString(arr[0]) + Integer.toString(arr[0]);
                prev2 = Integer.toString(arr[1]) + Integer.toString(arr[1]);
            } else {
                q.add(Integer.toString(arr[0]) + prev1 + Integer.toString(arr[0]));
                prev1=Integer.toString(arr[0]) + prev1 + Integer.toString(arr[0]);
                q.add(Integer.toString(arr[0]) + prev2 + Integer.toString(arr[0]));
                q.add(Integer.toString(arr[1]) + prev2 + Integer.toString(arr[1]));


            }
        }
            for (int j = 0; j < A; j++) {
                output=q.remove();
            }


    return  output;
    }
}
