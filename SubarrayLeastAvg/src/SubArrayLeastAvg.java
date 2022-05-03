import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubArrayLeastAvg {
    public static void main(String[] args) {
        Integer[] arrInt={5, 15, 7, 6, 3, 4, 18, 14, 13, 7, 3, 7, 2, 18};
        List<Integer> lstA=(List<Integer>) Arrays.asList(arrInt);
        ArrayList<Integer> A= new ArrayList<Integer>(lstA);
        //A=(ArrayList<Integer>) Arrays.asList(arrInt);
        int B=6;

        System.out.println(solve(A,B));
    }
    public static int solve(ArrayList<Integer> A, int B) {
        int sum=0;
        int leastsum=Integer.MAX_VALUE;
        int start_idx=0;
       // int minavg=Integer.MAX_VALUE;

        for (int i = 0; i < B; i++) {
            sum += A.get(i);
            leastsum = sum;
        }
        for(int i=B;i<A.size();i++)
        {
            sum += A.get(i) - A.get(i - B);

            //start_idx=i;
            // for(int j=i;j<B;j++){
            //     sum=sum+A.get(j);
            //}
            //average=sum/B;
            if(sum<leastsum){
                start_idx=i-B+1;
                leastsum=sum;
            }
        }
        return start_idx;
    }
}
