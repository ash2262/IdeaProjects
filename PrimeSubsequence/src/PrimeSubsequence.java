

public class PrimeSubsequence {
    public static void main(String[]args){
    //int[] A={1,2,3};
    int[] A={9, 4, 9, 1, 5};
        System.out.println(solve(A));
    }
    public static int solve(int[] A)
    {
        int count=0;
        int mod=1000000007;
        int num=1;
        for (int i = 0; i <A.length ; i++) {
            if(isPrime(A[i])){
                count=count%mod+num%mod;
                count=count%mod;
                num=num%mod+num%mod;
                num=num%mod;
            }
        }
        return  count;
    }
    public  static boolean isPrime(int N){
        if(N<2)
            return  false;
        for (int i = 2; i*i <= N; i++) {
            if(N%i==0)
                return  false;
        }
        return true;
    }
}


