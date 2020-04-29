import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ExampleTest {

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Before Class");
    }

    @Before
    public void before() {
        System.out.println("Before Test Case");
    }

    @Test
    public void addTwoandTwo() {
        System.out.println("Test 2 + 2");
        assertTrue("add(2,2) equals 4", ExampleClass.add(2, 2) == 4.0);
    }
}