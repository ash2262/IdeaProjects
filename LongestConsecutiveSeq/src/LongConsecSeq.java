import java.util.HashMap;
import java.util.HashSet;

public class LongConsecSeq {
    public static void main(String[] args) {
    int[] A={100, 4, 200, 1, 3, 2};
        System.out.println(longestConsecutive(A));
    }
    public static int longestConsecutive(final int[] A) {
       int ans=0;
        int cnt=1;
        HashSet<Integer> hs=new HashSet<>();
        for (int i = 0; i < A.length; i++) {
            hs.add(A[i]);
        }

        for (int i = 0; i < A.length; i++) {
            if(!hs.contains(A[i]-1)){

                int ele=A[i]+1;
                while (true){

                    if(hs.contains(ele)){
                        cnt++;
                        ele++;
                    }else
                        break;
                }

            }
            ans=Math.max(ans,cnt);
        }
        return ans;
    }
}
