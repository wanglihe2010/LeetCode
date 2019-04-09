import org.junit.*;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;


public class Test80 {
    private Problem80 problem80;
    @Before
    public void setUp() throws Exception {
        problem80 = new Problem80();
    }

    @After
    public void tearDown() throws Exception {
        problem80 = null;
    }

    @Test
    public void test1() {
        int[] nums= {0,0,1,1,1,1,2,3,3};
        int len = problem80.removeDuplicates(nums);
        int[] expected = {0,0,1,1,2,3,3};
        int[] result = Arrays.copyOfRange(nums,0,len);
        Assert.assertArrayEquals( expected, result );
    }

}