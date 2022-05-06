import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class SortOnB {
    public static void main(String[] args) {
    //int[] A={1, 2, 3, 4, 5};
    //int[] B={5, 4, 2};
       // int[] A={15, 5, 10, 6, 14};
       // int[] B={8, 16, 6, 2, 13, 1, 12, 3, 14};
       // int[] A={ 3, 20, 17, 17};
        //int[] B={5, 9, 20, 11, 6, 18, 7, 13};
        int[] A={10, 2, 18, 16, 16, 16};
        int[] B={3, 13, 2, 16, 4, 19};
    int[] output=solve(A,B);
        for (int i = 0; i < output.length; i++) {
            System.out.println(output[i]);
        }
    }
    public static int[] solve(int[] A, int[] B) {
        ArrayList<Integer> lst=new ArrayList<Integer>();
        HashMap<Integer,Integer> hm=new HashMap<Integer, Integer>();
        Arrays.sort(A);
        for (int i = 0; i < A.length; i++) {
            hm.put(A[i],hm.getOrDefault(A[i],0)+1);
        }
        for (int i = 0; i < B.length; i++) {
            if(hm.containsKey(B[i]))
            {
                int freq=hm.get(B[i]);
                while (freq>0){
                    lst.add(B[i]);
                    freq--;
                }
            }
        }
        for (int i = 0; i < A.length; i++) {
            if(!lst.contains(A[i])){
                int freq=hm.get(A[i]);
                while (freq>0){
                lst.add(A[i]);
                freq--;
                }
            }
        }
        return  lst.stream().mapToInt(value -> value).toArray();
    }
}
