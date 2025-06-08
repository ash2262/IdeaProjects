public class CyclicPermutations {

    public static void main(String[] args) {
    String A="1001";
    //    String A="111";
    String B="0011";
    //    String B="111";

        System.out.println(solve(A,B));
    }
    public static int solve(String A, String B) {
        // append B to B to tackle cyclic permutations
        B += B;
        int n = A.length(), m = B.length();
        int lps[] = new int[n];
        computeLPS(lps, A);
        int i = 0, l = 0, ans = 0;
        while (i < m - 1) {
            if (B.charAt(i) == A.charAt(l)) {
                i++;
                l++;
            }
            if (l == n) {
                l = lps[l - 1];
                ans++;
            } else if (i < m && B.charAt(i) != A.charAt(l)) {
                if (l > 0) {
                    l = lps[l - 1];
                } else {
                    i++;
                }
            }
        }
        return ans;
    }

    // function used to longest proper suffix array
    public static void computeLPS(int lps[], String s) {
        int n = s.length();
        lps[0] = 0;
        int l = 0, i = 1;
        while (i < n) {
            if (s.charAt(i) == s.charAt(l)) {
                lps[i] = l + 1;
                i++;
                l++;
            } else {
                if (l > 0) {
                    l = lps[l - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
    }
}
