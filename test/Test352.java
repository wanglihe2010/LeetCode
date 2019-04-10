import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;


public class Test352 {
    private Problem352 problem352;
    @Before
    public void setUp() throws Exception {
        problem352 = new Problem352();
    }

    @After
    public void tearDown() throws Exception {
        problem352 = null;
    }

    @Test
    public void test1() {
        problem352.addNum(1);
        problem352.addNum(3);
        problem352.addNum(7);
        problem352.addNum(2);
        problem352.addNum(6);
        List<Problem352.Interval> result = problem352.getIntervals();
        int n =7;


        int[] expected = {0,0,1,1,0,0,0,0};

    }

    @Test
    public void test2() {
        problem352.addNum(1);
        problem352.addNum(9);
        problem352.addNum(2);

        List<Problem352.Interval> result = problem352.getIntervals();
        int n =7;


        int[] expected = {0,0,1,1,0,0,0,0};

    }

    @Test
    public void test3() {
        problem352.addNum(6);
        problem352.addNum(6);
        problem352.addNum(0);
        problem352.addNum(4);
        problem352.addNum(8);
        problem352.addNum(7);
        problem352.addNum(6);
        problem352.addNum(4);
        problem352.addNum(7);
        problem352.addNum(5);
        List<Problem352.Interval> result = problem352.getIntervals();
        int n =7;


        int[] expected = {0,0,1,1,0,0,0,0};

    }

    @Test
    public  void test4() {
        int[] nums = {49,97,53,5,33,65,62,51,100,38,61,45,74,27,64,17,36,17,96,12,79,32,68,90,77,18,39,12,93,9,87,42,60,71,12,45,55,40,78,81,26,70,61,56,66,33,7,70,1,11,92,51,90,100,85,80,0,78,63,42,31,93,41,90,8,24,72,28,30,18,69,57,11,10,40,65,62,13,38,70,37,90,15,70,42,69,26,77,70,75,36,56,11,76,49,40,73,30,37,23};
        for(int num : nums) {
            if(num == 40){
                int i = 0;
            }
            problem352.addNum(num);
        }
        List<Problem352.Interval> result = problem352.getIntervals();
        int n =7;
    }

}
