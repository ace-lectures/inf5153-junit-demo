import tests.IntegerTests;
import uutf.TestRunner;

public class Main {
    public static void main(String[] args) {
        System.out.println("# JUnit Demonstration");

        TestRunner runner = new TestRunner();
        runner.runAndPrint(new IntegerTests());
    }
}
