public class MaxSubmatrixSum {
    public static void main(String[] args) {
    int[][] A={{-5, -4, -3},{-1 , 2 , 3},{2 , 2 , 4}};
        System.out.println(solve(A));
    }
    public static long solve(int[][] A) {
        int n = A.length;
        int m = A[0].length;
        long suff[][] = new long[n][m];
        suff[n - 1][m - 1] = A[n - 1][m - 1];
        long ans = suff[n - 1][m - 1];
        for(int j = m - 2 ; j >= 0 ; j--){
            suff[n - 1][j] = suff[n - 1][j + 1] + A[n - 1][j];
            ans = Math.max(ans, suff[n - 1][j]);
        }
        for(int i = n - 2 ; i >= 0 ; i--){
            suff[i][m - 1] = suff[i + 1][m - 1] + A[i][m - 1];
            ans = Math.max(ans, suff[i][m - 1]);
        }
        for(int i = n - 2 ; i >= 0 ; i--){
            for(int j = m - 2 ; j >= 0 ; j--){
                suff[i][j] = A[i][j] + suff[i + 1][j] + suff[i][j + 1] - suff[i + 1][j + 1];
                ans = Math.max(ans, suff[i][j]);
            }
        }
        return ans;
    }
}
