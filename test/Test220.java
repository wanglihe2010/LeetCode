import org.junit.*;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;


public class Test220 {
    private Problem220 problem220;
    @Before
    public void setUp() throws Exception {
        problem220 = new Problem220();
    }

    @After
    public void tearDown() throws Exception {
        problem220 = null;
    }

    @Test
    public void test1() {
        int[] nums= {2433,3054,9952,6470,2509,8502,-8802,-5276,6559,-9555};
        int k =10;
        int t= 1000;
        boolean result = problem220.containsNearbyAlmostDuplicate2(nums,k,t);
        boolean expected = false;
        assertEquals(expected,result);
    }


}