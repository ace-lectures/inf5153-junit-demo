package tests;

import uutf.TestCase;
import uutf.TestSuite;

import static uutf.Assertions.assertEquals;

public class IntegerTests extends TestSuite {

    public IntegerTests() {
        addTest(new SubtractTwoNumbers());
        addTest(new ThrowAnException());
        addTest(new AddTwoNumbers());
    }

    private class AddTwoNumbers extends TestCase {

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

    private class SubtractTwoNumbers extends TestCase {

        private int x, y = 0;

        @Override
        protected void setUp() {
            x = 1;
            y = 1;
        }

        @Override
        protected void test() {
            assertEquals(1, x-y);
        }

    }

    private class ThrowAnException extends TestCase {

        @Override
        protected void test() {
            throw new RuntimeException();
        }

    }

}
