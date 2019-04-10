import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class Test952 {
    private Problem952 problem952;
    @Before
    public void setUp() throws Exception {
        problem952 = new Problem952();
    }

    @After
    public void tearDown() throws Exception {
        problem952 = null;
    }

    @Test
    public void test1() {
        int[] nums= {0,1,0,1,1,0,0,1};
        int n =7;

        int[] result = problem952.prisonAfterNDays(nums,n);
        int[] expected = {0,0,1,1,0,0,0,0};
        Assert.assertArrayEquals( expected, result );
    }

    @Test
    public void  test2() {
        int[] nums = {0 ,0 ,0 ,1 ,1 ,0 ,1 ,0};
        int n =574;

        int[] result = problem952.prisonAfterNDays(nums,n);
        int[] expected = {0,0,0,1,1,0,1,0};
        Assert.assertArrayEquals( expected, result );
    }
}