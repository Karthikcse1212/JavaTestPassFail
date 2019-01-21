package JavaTest;

import org.testng.Assert;
import org.testng.annotations.Test;


public class Fail {
	
    String className = "HardAssertion";

    @Test
    public void test_UsingHardAssertion() {

        Assert.assertTrue(true == true);
        Assert.assertEquals("HardAsser", "HardAssertion");
        Assert.assertEquals(className, "HardAssertion");
        System.out.println("Successfully passed!");
    }
	
}
