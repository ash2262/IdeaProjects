import java.util.HashSet;

public class CompareSortedArr {
    public static void main(String[] args) {
        //int[] A={1, 7, 11, 8, 11, 7, 1};
        //int B[][]={{0, 2, 4, 6}};
        //expected ans=1

        int[] A={1, 3, 2};
        int B[][]={{0, 1, 1, 2}};
        ////expected ans=0
        
        int[] ans= solve(A,B);;
        for (int i = 0; i <ans.length ; i++) {
            System.out.println(ans[i]);
        }
    }
    public static int[] solve(int[] A, int[][] B) {
        HashSet<Integer> hs=new HashSet<Integer>();
        int start1= B[0][0];
        int end1=B[0][1];
        int[] res = new int[B.length];
        res[0]=0;
        int start2=B[0][2];
        int end2=B[0][3];

        for (int i = start1; i <= end1; i++) {
        hs.add(A[i]);
        }

        for (int i = start2; i <= end2; i++) {
            if(!hs.contains(A[i]))
                return res;
        }
        res[0]=1;
        return  res;
    }
}
