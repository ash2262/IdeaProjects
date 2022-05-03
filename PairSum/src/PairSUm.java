import java.util.ArrayList;
import  java.util.HashMap;
public class PairSUm {
    public static void main(String[] args) {
        int[] Arr = { 1, 2, 3, 4, 5 };
        int B = 2;
        System.out.println(solve(Arr,B));
        //Console.WriteLine(solve(Arr,B));

        int[] Brr = { 5, 17, 100, 11 };
        int C = 28;
        System.out.println(solve(Brr,C));
        //Console.WriteLine(solve(Brr,C));
    }

    public static int solve(int[] A, int B) {
        int n=A.length;
        long count=0;
        int mod=1000000007;
        HashMap<Integer,Long> hm=new HashMap<Integer,Long>();
        for(int i=0;i<n;i++){
            int val=0;
            if(A[i]>0){
                val=A[i]%B;
            }else{
                val=(A[i]%B)+B;
            }

            if(hm.containsKey(val)){
                hm.put(val,hm.get(val)+1l);
            }else{
                hm.put(val,1l);
            }
        }

        if(hm.get(0)!=null){
            long k=hm.get(0);
            k=k%mod;
            count+=(k*(k-1))/2;
        }

        int i=1,j=B-1;
        while(i<j){
            if((hm.get(i) != null) && (hm.get(j) != null)){
                count+=hm.get(i)*hm.get(j);
            }
            i++;
            j--;
        }

        if(B%2==0){
            if(hm.get(B/2)!=null){
                long k=hm.get(B/2);
                k=k%mod;
                count+=(k*(k-1))/2;
            }
        }

        if(count<0){
            return (int)(count+mod)%mod;
        }
        return (int)count%mod;
    }
}
