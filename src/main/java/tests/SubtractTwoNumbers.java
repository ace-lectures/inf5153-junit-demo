package tests;

import uutf.TestCase;

import static uutf.Assertions.assertEquals;

public class SubtractTwoNumbers extends TestCase {

    @Override
    protected void test() {
        int x = 1;
        int y = 1;
        assertEquals(1, x-y);
    }

}
