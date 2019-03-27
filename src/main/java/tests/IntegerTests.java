package tests;

import uutf.Test;
import uutf.TestCase;
import uutf.TestSuite;

import static uutf.Assertions.assertEquals;

public class IntegerTests extends TestCase {

    private int x, y = 0;

    public void setUp() { x = 1; y = 1; }
    public void test_addTwoNumbers() { assertEquals(2, x+y); }
    public void test_subtractTwoNumbers() { assertEquals(1, x-y); }
    public void test_throwAnException() { throw new RuntimeException(); }

}
