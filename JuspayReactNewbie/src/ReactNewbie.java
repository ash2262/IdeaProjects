
import java.util.HashMap;
import  java.util.Scanner;
public class ReactNewbie {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = Integer.parseInt(s.nextLine()) ;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for (int i = 0; i < n; i++) {
            int x=Integer.parseInt(s.nextLine());
            hm.put(x,0);
        }
        int e=Integer.parseInt(s.nextLine());

    }
}
