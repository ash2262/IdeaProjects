import java.util.HashMap;

public class zeroSumSubarray {
    public static void main(String[] args) {
    int[] A={-1, 1};
        System.out.println(solve(A)); 
    }
    public static int solve(int[] A) {
        int ans=0;
        long sum=0;
        HashMap<Long,Integer> hm=new HashMap();
        for (int i = 0; i < A.length; i++) {
            sum+=A[i];
            if(hm.containsKey((sum))||sum==0)
                return 1;
            else
                hm.put(sum,i);
        }
        
        return 0;
    }
}
