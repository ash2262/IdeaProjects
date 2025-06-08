import java.util.LinkedList;
import java.util.Queue;

public class TaskSchedulingDebug {
    public static void main(String[] args) {
        System.out.println(solve(4));
    }
    public static String solve(int A) {

        int count = 0;
        Queue<Long> queue = new LinkedList<>();
        if (A == 1) { return "11"; }
        if (A == 2) { return "22"; }
        count +=2;
        queue.add(1L);
        queue.add(2L);
        while (count <= A){
            long x = queue.poll();
            x = x * 10;
            queue.add(x+1);
            queue.add(x+2);
            count +=1;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(""+queue.poll());

        return sb.toString()+ (sb.reverse()).toString();
    }
}
