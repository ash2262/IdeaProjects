public class MinAbsDiff {

    public static void main(String[] args) {

        int[] A={1, 4, 5, 8, 10};
        int[] B={6, 9, 15};
        int[] C={6, 9, 15};
        System.out.println(solve(A,B,C));
    }
    public static int solve(int[] A, int[] B, int[] C) {
        int i=0;
        int j=0;
        int k=0;
        int ans=Integer.MAX_VALUE;
        while ((i<A.length)&&(j<B.length)&&(k<C.length)){
            int max = Math.max(A[i], Math.max(B[j], C[k]));
            int min = Math.min(A[i], Math.min(B[j], C[k]));

            int diff=max-min;
            if(diff<ans)
                ans=diff;

            if(A[i]==min)
                i++;
            if(B[j]==min)
                j++;
            if(C[k]==min)
                k++;
        }
    return ans;
    }
}
