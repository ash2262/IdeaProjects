import java.util.ArrayList;
import java.util.Arrays;

public class Bulb {
    public static void main(String[] args) {
        Integer[] arrA={0, 1, 0, 1};
        //Integer[] arrA={1, 1, 0, 0, 1, 1, 0, 0, 1};
        ArrayList<Integer> A= new ArrayList<>();
        Integer count=0;
        for (int j = 0; j < arrA.length; j++) {
            A.add(arrA[j]);
        }

        for (int i = 0; i <A.size() ; i++) {

            if((A.get(i)==0)&&(i<A.size()-1))
                if(A.get(i+1)==1)
                count= count+2;

        }
        System.out.println(count);

    }
}
