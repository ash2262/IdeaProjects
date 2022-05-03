public class InterestingArray {
    public static void main(String[] args) {

    }
    public String solve(ArrayList<Integer> A) {
        int output=0;
        int count=0;
        int splitted=0;
        int merge=0;
        for(int i=0;i<A.size();i++){

            if(A.get(i)%2!=0){
                count++;
            }

        }
        if(count%2==0){
            return "Yes";
        }
        else{
            return "No";
        }
    }
}
