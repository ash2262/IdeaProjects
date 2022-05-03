public class ABModulo {
    public static void main(String[] args) {
        System.out.println(solve(6398296,4958285));
    }
    public static int solve(int A, int B) {

        int min=Math.max(A,B);

        for(int i=min;i>0;i--)
        {
            if((A%i)==(B%i))
            {
                return i;
            }
        }
        return -1;
    }
}
