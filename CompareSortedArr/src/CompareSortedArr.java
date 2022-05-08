import java.util.ArrayList;
import java.util.HashSet;

public class CompareSortedArr {
    public static void main(String[] args) {
        //int[] A={1, 7, 11, 8, 11, 7, 1};
        //int B[][]={{0, 2, 4, 6}};
        //expected ans=1
        int[] arrA={1, 3, 2};
                ArrayList<Integer> A=new ArrayList<>();
                for (int j = 0; j < arrA.length; j++) {
                    A.add(arrA[j]);
                }


        int B[][]={{0, 1, 1, 2}};
        ////expected ans=0
        ArrayList<Integer> ans=new ArrayList<>();
         ans= solve(A,B);;
        for (int i = 0; i <ans.length ; i++) {
            System.out.println(ans[i]);
        }
    }
    public static ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<ArrayList<Integer>> B) {
        int n = A.size();
        Random rd = new Random();
        HashMap < Integer, Long > hm = new HashMap < > ();
        HashSet < Long > used = new HashSet < > ();
        long psum[] = new long[n + 1];
        for (int i = 0; i < n; i++) {
            if (!hm.containsKey(A.get(i))) {
                long hash = rd.nextLong();
                while (used.contains(hash)) {
                    hash = rd.nextLong();
                }
                hm.put(A.get(i), hash);
            }
            psum[i + 1] = psum[i] + hm.get(A.get(i));
        }
        ArrayList < Integer > ans = new ArrayList < Integer > ();
        for (ArrayList < Integer > tmp: B) {
            long val1 = psum[tmp.get(1) + 1] - psum[tmp.get(0)];
            long val2 = psum[tmp.get(3) + 1] - psum[tmp.get(2)];
            if (val1 == val2) {
                ans.add(1);
            } else {
                ans.add(0);
            }
        }
        return ans;
    }
}
