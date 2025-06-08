public class MaxSumSubMatrix {
    public static void main(String[] args) {

    }
    public static int kadane(ArrayList<Integer> v)
    {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < (int)v.size(); i++) {
            currSum += v.get(i);
            if (currSum > maxSum) {
                maxSum = currSum;
            }

            if (currSum < 0) {
                currSum = 0;
            }
        }
        return maxSum;
    }
    public static int solve(int[][] A) {
        int r = A.length;
        int c = A[0].length;
        int prefix[][] = new int[r][c];
        for(int i=0 ; i<r ; i++){
            for(int j=0 ; j<c ; j++){
                if(j==0)
                    prefix[i][j] = A[i][j];
                else
                    prefix[i][j] = A[i][j] + prefix[i][j - 1];
            }
        }
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < c; i++) {
            for (int j = i; j < c; j++) {
                ArrayList<Integer>v = new ArrayList();
                for (int k = 0; k < r; k++) {
                    int el = 0;
                    if (i == 0)
                        el = prefix[k][j];
                    else
                        el = prefix[k][j] - prefix[k][i - 1];
                    v.add(el);
                }
                maxSum = Math.max(maxSum, kadane(v));
            }
        }
        return maxSum;
    }
}
