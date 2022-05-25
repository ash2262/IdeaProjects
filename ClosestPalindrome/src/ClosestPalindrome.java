public class ClosestPalindrome {
    public static void main(String[] args) {
        String A = "abba";
        //    String A="adaddb";
        System.out.println(solve(A));

    }

    public static String solve(String A) {

        int len = A.length();

        int Count = 0;

        for(int i = 0; i < (len>>1); i++) {

            if(A.charAt(i) != A.charAt(len - i - 1)) {

                if(Count == 1) return "NO";

                Count++;

            }

        }

        return (Count == 1 || ((len&1)==1)) ? "YES" : "NO";
    }
}
