import java.util.HashMap;

public class ColorfulNo {
    public static void main(String[] args) {
        System.out.println(colorful(236));
    }
    public static int colorful(int A) {
        HashMap<Integer,Integer> hm=new HashMap();
        String str=Integer.toString(A);
        for (int i = 0; i < str.length(); i++) {
            int product=1;
            for (int j = i; j < str.length(); j++) {
                int num=str.charAt(j)-'0';
                product*=num;
                if(hm.containsKey(product)) return 0;
                hm.put(product,hm.getOrDefault(product,0)+1);
            }
        }

        return 1;
    }
}
