import java.lang.reflect.Array;
import java.util.ArrayList;
public class SubArrayOR {
    public static void main(String[] args) {
        int[] arrA={16, 17, 4, 3, 5, 2};
                ArrayList<Integer> A=new ArrayList<>();
                for (int j = 0; j < arrA.length; j++) {
                    A.add(arrA[j]);
                }
        System.out.println( solve(A));
    }
    public static int solve(ArrayList<Integer> A) {
        long sum = 0;
        int prev[] = new int[32]; //Creating array of 32 Bits which will be fill filled with 1 and not 0
        int mod=1000000007;

        for(int i = 1; i <= A.size(); i++) {
            int sum2 = A[i - 1];
            for(int j = 0; j < 32; j++){
                long pow = (1 << j);//Left shifting 1, j times
                if((sum2 & pow) != 0) {//if sum2 & pow != 0 than we add we add i in the array
                    sum = (sum + (pow * i) % mod) % mod; //calculating sum using mod
                    prev[j] = i; //add i in the array
                } else if(prev[j] != 0) {
                    sum = (sum + (pow * prev[j]) % mod) % mod;//if prev[j] != 0 than we calculate sum again.
                }
            }
        }

        return (int) (sum % mod);  //taking mod for all subarray sum

    }
}
