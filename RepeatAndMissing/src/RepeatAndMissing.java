import  java.util.Arrays;
public class RepeatAndMissing {
    public static void main(String[] args) {
        int[] Arr = { 3, 1, 2, 5, 3 };
        int[] out=repeatedNumber(Arr);
        for (int i = 0; i <out.length ; i++) {
            System.out.println(out[i]);
        }
    }
    public static int[] repeatedNumber(final int[] A) {

        int n = A.length;

        int sum = 0;

        int var = 0;

        for (int i = 0; i < n; i++) {
            int val = A[i];

            sum ^= Math.abs(A[i])^(i+1);

            int ind = Math.abs(val) - 1;

            if (A[ind] < 0) {
                var = Math.abs(val);
            }

            A[ind] = -A[ind];
        }
        int second = sum^var;

        return new int[] { var, second };

    }

}
