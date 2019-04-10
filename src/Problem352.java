import java.util.ArrayList;
import java.util.List;

public class Problem352 {
    private List<Interval> listIntervals;

    /**
     * Initialize your data structure here.
     */
    public Problem352() {
        listIntervals = new ArrayList<>();
    }

    public void addNum(int val) {
        if(listIntervals.isEmpty()) listIntervals.add(new Interval(val,val));
        int left = 0;
        int right = listIntervals.size() - 1;

        int leftResult = addtoExisting(val, left);
        if (leftResult == 0) return;
        else if (leftResult == -1) {
            listIntervals.add(left, new Interval(val, val));
            return;
        }
        int rightResult = addtoExisting(val, right);
        if (rightResult == 0) return;
        else if (rightResult > 0) {
            listIntervals.add(new Interval(val, val));
            return;
        }

        while (right - left > 1) {

            int mid = (left + right) / 2;
            int midResult = addtoExisting(val, mid);
            if (midResult < 0) right = mid;
            else if (midResult > 0) left = mid;
            else return;
        }
        listIntervals.add(left+1, new Interval(val, val));
    }



    public List<Interval> getIntervals() {
        return listIntervals;
    }

    private int addtoExisting(int val, int index) {
        Interval interval = listIntervals.get(index);
        if(val < interval.start){
            if(val == interval.start -1) {
                if(index-1 >=0 && listIntervals.get(index -1).end == val - 1) {
                    interval.start = listIntervals.get(index -1).start;
                    listIntervals.remove(index-1);
                } else {
                    interval.start = val;
                }
                return 0;
            }
            return -1;
        } else if(val > interval.end) {
            if(val == interval.end +1) {
                if(index+1 <listIntervals.size() && listIntervals.get(index +1).start == val + 1) {
                    interval.end = listIntervals.get(index +1).end;
                    listIntervals.remove(index+1);
                } else {
                    interval.end = val;
                }
                return 0;
            }
            return 1;
        } else{
            return 0;
        }
    }

    public class Interval {
        int start;
        int end;
        Interval() { start = 0; end = 0; }
        Interval(int s, int e) { start = s; end = e; }
     }
}




