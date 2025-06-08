public class max_sum_contiguous_arr {
    public static void main(String[] args) {

    }
    public int maxSubArray(final int[] A) {
        int sum_till_now=0;
        int max_sum=0;

        for(int i=0;i<A.length;i++){
            sum_till_now+=A[i];
            if(max_sum<sum_till_now)
                max_sum=sum_till_now;

            if(sum_till_now<0)
                sum_till_now=0;
        }
        return max_sum;
    }
}
