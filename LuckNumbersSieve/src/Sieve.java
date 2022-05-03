public class Sieve {

    public static void main(String[] args) {
        System.out.println(solve(12));
    }
    static int[]  primeFactor(int n)
    {
        int[] prime = new int[n];
        for(int i=2; i<n; i++)
        {
            prime[i] = i;
        }
        for(int i=2; i*i<n; i++)
        {
            if(prime[i] == i)
            {
                for(int j=i*i; j<n; j+=i)
                {
                    if(prime[j] == j)
                        prime[j] = i;
                }
            }
        }
        return prime;
    }
    public static int solve(int A) {

        int[] prime = primeFactor(A+1);
        int res = 0;
        for(int i=2; i<=A; i++)
        {
            int num = i;
            int count = 0;
            while(num != 1)
            {
                int d = prime[num];
                while(prime[num] == d)
                {
                    num = num/d;
                }
                count++;
            }
            if(count == 2)
                res++;
        }
        return res;
    }
}
