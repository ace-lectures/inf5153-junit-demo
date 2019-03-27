import tests.IntegerTests;
import uutf.TestFactory;
import uutf.TestRunner;

public class Main {
    public static void main(String[] args) {
        System.out.println("# JUnit Demonstration");

        TestFactory scanner = new TestFactory();
        TestRunner runner = new TestRunner();
        runner.runAndPrint(scanner.scan(IntegerTests.class));

    }
}
