public class FirstMissingIntege {
    public static void main(String[] args) {
        //int[] A={1, 2, 0};
        int[] A={1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 20};
        System.out.println(firstMissingPositive(A));
    }
    public static int firstMissingPositive(int[] A) {
        int n = A.length;
        for(int i=0; i<n; i++){
            if(A[i] < 0){
                A[i] = (n+2);
            }
        }

        for(int j=0; j<n; j++){
            int ele = Math.abs(A[j]);
            if(ele >= 1 && ele <= n){
                 A[ele-1] = -1 * Math.abs(A[ele-1]);
               // A[ele-1] = n+2;
            }
        }

        for(int k=0; k<n; k++){
             if(A[k] > 0){
            // if(A[k] !=n+2){
                return (k+1);
            }
        }
        return (n+1);
    }
}
