import java.awt.Point;
import java.util.HashMap;

public class RectanglesOverlap {
    public static void main(String[] args) {
        /*int A = 0;
        int B = 0;
        int C = 4;
        int D = 4;
        int E = 2;
        int F = 2;
        int G = 6;
        int H = 6;
    */

        HashMap<integer,integer> hm=new HashMap<integer, integer>();

        int A = 6;
        int B = 8;
        int C = 10;
        int D = 9;
        int E = 6;
        int F = 1;
        int G = 9;
        int H = 6;
        System.out.println(solve(A,B,C,D,E,F,G,H));
    }
    public static int solve(int A, int B, int C, int D, int E, int F, int G, int H) {

        Point l1 = new Point(),r1 = new Point(),
                l2 = new Point(),r2 = new Point();

        l1.x=A;l1.y=B; r1.x=C;r1.y=D;
        l2.x=E;l2.y=F; r2.x=G;r2.y=H;
        if (l1.x == r1.x || l1.y == r1.y || l2.x == r2.x || l2.y == r2.y)
        {
            return 0;
        }

        if(l1.x>r2.x||l2.x>r1.x)
        {
            return 0;
        }
        //if(r1.y>l2.y||r2.y>l1.y)
        //{
        //    return 0;
        //}
        return 1;
    }
}
