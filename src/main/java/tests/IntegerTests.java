package tests;

import uutf.TestSuite;

public class IntegerTests extends TestSuite {

    public IntegerTests() {
        addTest(new SubtractTwoNumbers());
        addTest(new ThrowAnException());
        addTest(new AddTwoNumbers());
    }

}
