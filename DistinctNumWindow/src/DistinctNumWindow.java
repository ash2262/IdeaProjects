import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class DistinctNumWindow {
    public static void main(String[] args) {
    int[] A={1, 2, 1, 3, 4, 3};
        int B=3;
        //int[] A={1, 1, 2, 2};
        //int B=1;
    int[] res=dNums(A,B);
        for (int i = 0; i <res.length ; i++) {
            System.out.println(res[i]);
        }


    }
    public static int[] dNums(int[] A, int B) {

        ArrayList<Integer> res=new ArrayList<>();
        HashMap<Integer,Integer> hm=new HashMap<>();
        for (int i = 0; i <B ; i++) {
            hm.put(A[i],hm.getOrDefault(A[i],0)+1);
        }
        res.add(hm.size() );
        for (int i = B; i <A.length ; i++) {
            if(hm.get(A[i-B])==1) hm.remove(A[i-B]);
            else hm.put(A[i-B],hm.get(A[i-B])-1);

            hm.put(A[i],hm.getOrDefault(A[i],0)+1);
            res.add(hm.size());
        }
    return res.stream().mapToInt(value -> value).toArray();
    }
}
