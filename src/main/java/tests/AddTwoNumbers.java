package tests;

import uutf.SingleTestCase;

import static uutf.Assertions.assertEquals;

public class AddTwoNumbers extends SingleTestCase {
    int x, y = 0;
    @Override public void setUp() { x = 1; y = 1; }
    @Override public void test() { assertEquals(2, x+y); }
}
