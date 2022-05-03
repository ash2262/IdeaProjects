import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaxSubArraySum {
    public static void main(String[] args) {
        Integer[] arrInt = {1, 2, 4, 4, 5, 5, 5, 7, 5};
        List<Integer> lstC = (List<Integer>) Arrays.asList(arrInt);
        ArrayList<Integer> C = new ArrayList<Integer>(lstC);
        int A=9;
        int B=14;
        System.out.println(maxSubarray(A,B,C));

    }
    public static int maxSubarray(int A, int B, ArrayList<Integer> C) {
        int N=C.size();
        int currMax=0;
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<N;i++){
            currMax = Math.max(C.get(i),
                    C.get(i) + currMax);
            if(C.get(i)==B){
                return C.get(i);
            }
            //sum=sum+C.get(i);
            if(currMax<=B){
                maxsum=Math.max(maxsum,currMax);
            }


            if(currMax<0){
                currMax=0;
            }
        }
        if(maxsum==Integer.MIN_VALUE){
            maxsum=0;
        }


        return maxsum;
    }
}
