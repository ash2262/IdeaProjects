import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class NInteger {
    public static void main(String[] args) {

        ArrayList<Integer> ans=new ArrayList<>(solve(7));
        for (int i = 0; i < ans.size(); i++) {
            System.out.println(ans.get(i));
        }
    }

    public static ArrayList<Integer> solve(int A) {
        ArrayList<Integer> ans=new ArrayList<>();

        Queue<Integer> q=new LinkedList<>();
            q.add(1);
            q.add(2);
            q.add(3);

        ans.add(1);
        ans.add(2);
        ans.add(3);

        int count=3;
        while (count<=A){
            int x=q.poll();
            x=x*10;

            q.add(x+1);
            q.add(x+2);
            q.add(x+3);

            ans.add(x+1);
            ans.add(x+2);
            ans.add(x+3);
            count=count+3;
        }
        return new ArrayList<Integer> (ans.subList(0,A));
    }
}
