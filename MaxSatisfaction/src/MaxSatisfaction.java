import java.util.ArrayList;
import java.util.Collections;

public class MaxSatisfaction {
    public static void main(String[] args) {
        int[] arrA={1, 18, 15, 16, 7, 127, 3, 83, 31, 23, 31 };
                ArrayList<Integer> A=new ArrayList<>();
                for (int j = 0; j < arrA.length; j++) {
                    A.add(arrA[j]);
                }
        System.out.println(solve(A));
    }
    public static int solve(ArrayList<Integer> A) {

        Collections.sort(A);
        int output=1;
        int max=0;
        int count=0;
        for(int i=0;i<A.size();i++){

            if((GetMSB(A.get(i)))==1){
                //max[i]=A.get(count);
                //count++;

                output=A.get(i);
                 if(output>max)
                 {
                     max=output;
                 }
                //output=max[i]&A.get(i);
            }
            //output=max;

        }
        return max;
    }
    public static int GetMSB(int intValue)
    {
        int[] binary=new int[35];
        if (intValue == 0)
            return 0;

        int msb = 0;
        intValue = intValue / 2;
        while (intValue != 0) {
            intValue = intValue / 2;
            msb++;
        }

        return (1 << msb);
    }

}
