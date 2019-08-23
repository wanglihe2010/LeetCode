import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class Test662 {
    private Problem662 problem662;
    @Before
    public void setUp() throws Exception {
        problem662 = new Problem662();
    }

    @After
    public void tearDown() throws Exception {
        problem662 = null;
    }

    @Test
    public void test1() {
        int[] nums= {1,3,2,5,3,9};
        int n =7;


        int[] expected = {0,0,1,1,0,0,0,0};

    }

}