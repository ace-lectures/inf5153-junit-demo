package tests;

import uutf.TestCase;
import static uutf.Assertions.assertEquals;

public class AddTwoNumbers extends TestCase {

    private int x, y = 0;

    @Override
    protected void setUp() {
        x = 1;
        y = 1;
    }

    @Override
    protected void test() {
        assertEquals(2, x+y);
    }

}
