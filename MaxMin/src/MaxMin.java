import java.util.Stack;

public class MaxMin {
    public static void main(String[] args) {
        //int[] A={4, 7, 3, 8};
        //int[] A={1};
        int[] A={994390, 986616, 976849, 979707, 950477, 968402, 992171, 937674, 933065, 960863, 980981, 937319, 951236, 959547, 991052, 991799, 992213, 941294, 978103, 997198, 960759, 988476, 963517, 980366, 921767, 979757, 977912, 983761, 981869, 947454, 930202, 999086, 973538, 999798, 996446, 944001, 974217, 951595, 942688, 975075, 970973, 970130, 897109, 927660, 862233, 997130, 986068, 954098, 978175, 889682, 988973, 996036, 969675, 985751, 977724, 881538, 988613, 924230, 906475, 915565, 986952, 975702, 994316, 964011, 986848, 983699, 949076, 989673, 981788, 929094, 988310, 926471, 994763, 999736, 980762, 973560, 996622, 934475, 998365, 966255, 998697, 998700, 911868, 983245, 996382, 996992, 953142, 994104, 987303, 853837, 960626, 904203, 998063, 977596, 977868, 996012, 946345, 949255, 988138, 996298, 954933, 965036, 886976, 998628, 990878, 953725, 916744, 985233, 919661, 970903, 986066};
        System.out.println(solve(A));
    }
    public static int solve(int[] A) {
        long ans=0;
        int mod=1000 * 1000 * 1000 + 7;

        int[] nsl=NSL(A);
        int[] nsr=NSR(A);
        int[] ngl=NGL(A);
        int[] ngr=NGR(A);
        long max=0;
        long min=0;

        for (int i = 0; i < A.length; i++) {
            long prodmax=(1L * (i-ngl[i])*(ngr[i]-i))%mod;
            max=(prodmax*A[i])%mod;
            long prodmin=(1L * (i-nsl[i])*(nsr[i]-i))%mod;
            min=(prodmin*A[i])%mod;
            ans=ans%mod+(max-min)%mod ;
            ans=ans%mod;
        }
        if (ans < 0) {
            ans = (ans + mod) % mod;
        }
        return (int)(ans%mod);
    }

    public static int[] NSL(int[] A){
        Stack<Integer> stack=new Stack<>();
        int[] out=new int[A.length];

        for (int i = 0; i < A.length; i++) {
            while (!stack.isEmpty()&& A[stack.peek()]>= A[i])
                stack.pop();

            if(!stack.isEmpty())
                out[i]=stack.peek();

            else
                out[i]=-1;

            stack.push(i);
        }
        return out;
    }

    public static int[] NGL(int[] A){
        Stack<Integer> stack=new Stack<>();
        int[] out=new int[A.length];

        for (int i = 0; i < A.length; i++) {
            while (!stack.isEmpty()&& A[stack.peek()]<= A[i])
                stack.pop();

            if(!stack.isEmpty())
                out[i]=stack.peek();

            else
                out[i]=-1;

            stack.push(i);
        }
        return out;
    }
    public static int[] NSR(int[] A){
        Stack<Integer> stack=new Stack<>();
        int[] out=new int[A.length];

        for (int i = A.length-1; i >=0 ; i--) {
            while (!stack.isEmpty()&& A[stack.peek()]>=A[i]){
                stack.pop();
            }
            if(!stack.isEmpty())
                out[i]=stack.peek();
            else
                out[i]=A.length;

            stack.push(i);
        }
        return out;
    }

    public static int[] NGR(int[] A){
        Stack<Integer> stack=new Stack<>();
        int[] out=new int[A.length];

        for (int i = A.length-1; i >=0 ; i--) {
            while (!stack.isEmpty()&& A[stack.peek()]<=A[i]){
                stack.pop();
            }
            if(!stack.isEmpty())
                out[i]=stack.peek();
            else
                out[i]=A.length;

            stack.push(i);
        }
        return out;
    }
}
