import java.util.HashMap;

public class ShaggyDist {
    public static void main(String[] args) {
        int[] A={7, 1, 3, 4, 1, 7};
        System.out.println(solve(A));
    }
    public static int solve(int[] A) {
        int ans = Integer.MAX_VALUE;

        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i = 0; i < A.length; i++)
        {
            if(hm.containsKey(A[i]))
            {
                ans = Math.min(ans, i - hm.get(A[i]));
            }else
            {
                hm.put(A[i], i);
            }
        }
        if(ans == Integer.MAX_VALUE)
        {
            return -1;
        }

        return ans;

    }
}
