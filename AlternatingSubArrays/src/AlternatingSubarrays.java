import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AlternatingSubarrays {
    public static void main(String[] args) {
        Integer[] arrInt = {0, 0, 1, 0, 1, 1, 0, 1, 0, 0, 0, 1};
        List<Integer> lstA = (List<Integer>) Arrays.asList(arrInt);
        ArrayList<Integer> A = new ArrayList<Integer>(lstA);
        ArrayList<Integer> output = new ArrayList<Integer>(lstA);
        int B=1;
        output=solve(A,B);
        for (int i = 0; i < output.size(); i++) {
            System.out.println(output.get(i));
        }

    }
    public static ArrayList<Integer> solve(ArrayList<Integer> A, int B) {
        ArrayList<Integer> Indexes=new ArrayList<Integer>();
        ArrayList<Integer> NoIndexes=new ArrayList<Integer>();
        int count=0;
        int N=A.size();
        int j=N;
        if((N==0)||(B==0)){
            return NoIndexes;
        }
        for(int i=0;i<N-1;i++){

            if(((A.get(i)==0)&&(A.get(i+1)==1)&&(A.get(i+2)==0))||((A.get(i)==1)&&(A.get(i+1)==0)&&(A.get(i+2)==1))){
                count++;

                if(count==((2*B)+1))
                {
                    Indexes.add(i-B);
                     return  Indexes;
                }
                //i=i+1;
            }
            else{
                if(B==0){
                    A.add(i);
                }
                count=0;
            }
        }

        return Indexes;
    }
}
