import java.util.HashSet;

public class NonRepeatSub {
    public static void main(String[] args) {
    String A = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(A));
    }
    public static int lengthOfLongestSubstring(String A) {
        int max=Integer.MIN_VALUE;
        HashSet<Character> hs=new HashSet<>();
        int i=0;int j=0;
        while (j<A.length()){

        if(!hs.contains((A.charAt(j)))) {
            hs.add(A.charAt(j));
            max = Math.max(hs.size(), max);
            j++;
        }
        else{
            hs.remove(A.charAt(i));
            i++;;
            }
        }
        return max;
    }
}
