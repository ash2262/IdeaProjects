import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ContSumQuery {
    public static void main(String[] args) {
        int A=5;
        ArrayList<ArrayList<Integer>> B=new ArrayList<ArrayList<Integer>>();
        //Integer[] numbers = new Integer[] { 1, 2, 10 };

        int[] arrA={1, 2, 10 };
                ArrayList<Integer> Arr=new ArrayList<>();
                for (int j = 0; j < arrA.length; j++) {
                    Arr.add(arrA[j]);
                }
        int[] arrB={2, 3, 20};
        ArrayList<Integer> ArrB=new ArrayList<>();
        for (int j = 0; j < arrA.length; j++) {
            Arr.add(arrB[j]);
        }

        int[] arrC={2, 3, 20};
        ArrayList<Integer> ArrC=new ArrayList<>();
        for (int j = 0; j < arrC.length; j++) {
            Arr.add(arrC[j]);
        }
        //Integer[] numbers1 = new Integer[] { 2, 3, 20};
        B.add(Arr );
        B.add(ArrB);
        B.add(ArrC);
        ArrayList<Integer> ans=new ArrayList<Integer>();
        ans=solve(A,B);
        for (int i = 0; i < ans.size(); i++) {
            System.out.println(ans.get(i));
        }
    }
    public static ArrayList<Integer> solve(int A, ArrayList<ArrayList<Integer>> B) {
        ArrayList<Integer> ans=new ArrayList(Collections.nCopies(A,0));
        for (int i = 0; i < B.size(); i++) {
            int start=B.get(i).get(0);
            int end=B.get(i).get(1);

            while (start<end){

                ans.set(start, ans.get(start)+B.get(i).get(2));
                start++;
            }
        }

        return  ans;
    }
}
