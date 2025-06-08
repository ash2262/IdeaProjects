import java.util.ArrayList;
import java.util.Collections;

public class CombinationSum {
    public static void main(String[] args) {
    int[] Aarr={10, 1, 2, 7, 6, 1, 5};

            ArrayList<Integer> A=new ArrayList<>();
            for (int j = 0; j < Aarr.length; j++) {
                A.add(Aarr[j]);
            }

    int B=8;
        ArrayList < ArrayList < Integer >> ans=new ArrayList<ArrayList<Integer>>();
        ans=combinationSum(A,B);
    }
   public static ArrayList < ArrayList < Integer >> res;
    public static ArrayList < ArrayList < Integer >> combinationSum(ArrayList < Integer > A, int B) {
        if (A == null)
            return null;
        res = new ArrayList < > ();
        Collections.sort(A);
        rec(A, new ArrayList < > (), B, 0);
        return res;
    }
    public static void rec(ArrayList < Integer > A, ArrayList < Integer > ans, int B, int index) {
        if (B == 0) {
            res.add(new ArrayList < > (ans));
            return;
        }
        if (B < 0 || index >= A.size())
            return;
        int i = index + 1;
        for (; i < A.size(); i++)
            if (A.get(i) != A.get(i - 1))
                break;
        rec(A, ans, B, i);
        ans.add(A.get(index));
        rec(A, ans, B - A.get(index), index + 1);
        ans.remove(ans.size() - 1);
    }
}
