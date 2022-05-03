import java.util.ArrayList;



public class Leader {
    public static void main(String[] args) {
        int[] arrA={16, 17, 4, 3, 5, 2};
        ArrayList<Integer> A=new ArrayList<>();
        for (int j = 0; j < arrA.length; j++) {
            A.add(arrA[j]);

        }
        int max=Integer.MIN_VALUE;
        ArrayList<Integer> result=new ArrayList<Integer>();
        int N=A.size();
        result.add(A.get(N-1));
        max=A.get(N-1);
        for(int i=N-2;i>=0;i--){            {

            if(max<A.get(i)){
                result.add(A.get(i));
                max=A.get(i);
                }
            }

        }
    }
}
