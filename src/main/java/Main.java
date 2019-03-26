import tests.AddTwoNumbers;
import tests.SubtractTwoNumbers;
import tests.ThrowAnException;

import static uutf.Assertions.assertEquals;

public class Main {
    public static void main(String[] args) {
        System.out.println("# JUnit Demonstration");
        (new AddTwoNumbers()).run();
        (new SubtractTwoNumbers()).run();
        (new ThrowAnException()).run();
    }
}
