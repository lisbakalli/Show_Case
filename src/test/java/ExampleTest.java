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
        assertTrue("add(2,2) equals 4", ExampleClass.add(2, 2) == 4.0);
    }

    @Test
    public void subtractTwoandTwo() {
        assertTrue("subtract(2,2) equals 0", ExampleClass.subtract(2, 2) == 0.0);
    }

    @Test
    public void addFail() {
        assertTrue("add(2,3) equals 4", ExampleClass.wrongAdd(2, 2) == 4.0);
    }
}