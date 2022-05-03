import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;


public class KeepMultiplying {
    public static void main(String[] args) {
        int original=2;
        //int[] nums={8,19,4,2,15,3};
        int[] nums={0,0,1,0};
        //Arrays.sort(nums);
        //System.out.println(findFinalValue( nums,  original));
        var output=maxScoreIndices(nums);
        for(int i=0;i<output.size();i++) {
            System.out.println(output.get(i));
        }
    }
    public static int findFinalValue(int[] nums, int original) {

        for(int i=0;i<nums.length;i++){
            if(nums[i]==original){
                original=2 * original;
            }
        }
        return original;
    }

    public static List<Integer> maxScoreIndices(int[] nums) {
        int count0=0;
        int maxcount0=0;
        int max0Index=-1;
        int max1Index=-1;
        int count1=0;
        int maxcount1=0;
        ArrayList<Integer> lst=new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++){
            for(int j=i;j<nums.length;j++)
            {
                if(nums[i]==0){
                    count0++;
                    if(maxcount0<count0){
                        maxcount0=count0;
                        max0Index=i;
                    }
                }
                if(nums[j]==1){
                    count1++;
                    if(maxcount1<count1){
                        maxcount1=count1;
                        max1Index=j;
                    }
                }
            }
        }
        lst.add(max0Index);
        lst.add(max1Index);
        return lst;
    }
}
