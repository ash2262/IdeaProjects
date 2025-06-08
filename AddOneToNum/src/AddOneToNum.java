import java.util.ArrayList;

public class AddOneToNum {
    public static void main(String[] args) {

   // int[] arrA={1, 2, 3};
        //int[] arrA={9,9,9,9,9};
        int[] arrA={0, 3, 7, 6, 4, 0, 5, 5, 5};
            ArrayList<Integer> A=new ArrayList<>();
            for (int j = 0; j < arrA.length; j++) {
                A.add(arrA[j]);
            }
        ArrayList<Integer> output=plusOne(A);
       // for (int i = 0; i < output.size(); i++) {
            System.out.println(output);
        //}

    }
    public static ArrayList<Integer> plusOne(ArrayList<Integer> A) {
        ArrayList<Integer> lst=new ArrayList<Integer>();
        int carry=1;
        int num=0;
        for (int i = A.size()-1; i >=0; i--) {
            num = A.get(i) + carry;
            carry = 0;
            if (num == 10) {
                carry = 1;
                num = 0;
            }
            A.set(i, num);

        }

        ArrayList<Integer> res=new ArrayList<Integer>();
        if(carry==1)
            res.add(1);
        for (int i = 0; i <A.size() ; i++) {
            if(A.get(i)==0 && res.size()==0)
                continue;
            res.add(A.get(i));
        }
        return  res;
    }
}
