import java.util.Arrays;

public class RepeatMiss {
    public static void main(String[] args) {
        int[] Arr = { 3, 1, 2, 5, 3 };
        int[] out=repeatedNumber(Arr);
        for (int i = 0; i <out.length ; i++) {
            System.out.println(out[i]);
        }
    }
    public static int[] repeatedNumber(final int[] A) {
        int n=A.length;
        Arrays.sort(A);
        int[] res=new int[2];
        int rep=-1;
        int miss=-1;
        int sum=A[0];
        for(int i=1;i<A.length;i++){
            if(A[i]==A[i-1]){
                rep=A[i];
                //miss=i;
            }
            sum+=A[i];
        }
        miss = (int) ((1L * n * (1L * n + 1)) / 2 - sum + rep);
        res[0]=rep;
        res[1]=miss;
        return res;
    }

}
