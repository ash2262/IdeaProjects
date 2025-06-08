import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class MergeIntervals {
    public class Interval {
        int start;
        int end;
        Interval() { start = 0; end = 0; }
      public    Interval(int s, int e) { start = s; end = e; }
    }
    public static void main(String[] args) {
        ArrayList<Interval> A=new ArrayList<>();

    }
    public static ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {

        intervals.add(newInterval);
        Collections.sort(intervals,new Comparator<Interval>(){
            @Override
            public int compare(Interval o1, Interval o2) {
                return o1.start -o2.start;
            }
        });
        int index=0;
        for (int i = 1; i < intervals.size(); i++) {
            if(intervals.get(index).end>=intervals.get(i).start){
                intervals.get(i).end=Math.max(intervals.get(index).end,intervals.get(i).end);
            }
            else {
                index++;
                intervals.set(index,intervals.get(i));
            }
        }


        ArrayList<Interval> ans=new ArrayList<Interval>();
        for (int i = 0; i < index; i++) {
            ans.add(intervals.get(index));
        }


        return  ans;
    }
}
