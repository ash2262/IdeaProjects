import java.util.HashSet;

public class ColorfulNum {
    public static void main(String[] args) {
        System.out.println(colorful(23));
    }
    public static int colorful(int A) {
        HashSet<Integer> set = new HashSet<>();
        int prev = -1;
        int n = 10;
        while(A>0){
            int currDigit = A%n;
            A = A/n;
            if(set.isEmpty()){
                set.add(currDigit);
                prev = currDigit;
                continue;
            }
            if(set.contains(currDigit)) return 0;
            set.add(currDigit);
            if(set.contains(currDigit*prev)) return 0;
            set.add(currDigit*prev);
            prev = currDigit ;
        }

        return 1;
    }
}
