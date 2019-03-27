import tests.AddTwoNumbers;
import tests.IntegerTests;
import tests.SubtractTwoNumbers;
import tests.ThrowAnException;
import uutf.TestRunner;

import static uutf.Assertions.assertEquals;

public class Main {
    public static void main(String[] args) {
        System.out.println("# JUnit Demonstration");

        TestRunner runner = new TestRunner();
        runner.runAndPrint(new IntegerTests());
    }
}
