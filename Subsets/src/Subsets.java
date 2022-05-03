import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class Subsets {
    public static void main(String[] args) {

        int[] arrA={12,13};


                ArrayList<Integer> A=new ArrayList<Integer>();
                for (int j = 0; j < arrA.length; j++) {
                    A.add(arrA[j]);
                }

        ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
        ans = subsets(A);

        for (int i=0;i<ans.size();i++)
        {
            System.out.println( ans.get(i));
        }
    }
    public static ArrayList<ArrayList<Integer>> subsets(ArrayList<Integer> A) {
        Collections.sort(A);
        ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
        double n= Math.pow(2,A.size());

        for (int i = 0; i < n; i++)
        {
            ArrayList<Integer> subset = new ArrayList<Integer>();

            for (int j = 0; j < A.size(); j++)
            {
                if (CheckBit(i, j))
                {
                    subset.add(A.get(j));
                }
            }
            ans.add(subset);
        }
       // IComparer Comp1 = new myClass();
        //ans.sort(comp1);
        ans.sort((x, y) -> {
            if(x.size()!=0&&y.size()!=0){
            for (int i = 0; i < Math.min(x.size(), y.size()); i++) {
                if ((x.get(i) != y.get(i))) {
                    return x.get(i) - y.get(i);
                }
            }
            }
            return x.size() - y.size();
        });
        //ans.sort((l1, l2) -> l1.get(0).compareTo(l2.get(0)));
        return ans;
    }
    public static boolean CheckBit(int N,int i)
    {
        return ((N >> i) & 1) == 1;
    }
}
