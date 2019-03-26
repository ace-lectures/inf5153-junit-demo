import static uutf.Assertions.assertEquals;

public class Main {
    public static void main(String[] args) {
        System.out.println("# JUnit Demonstration");
        try {
            System.out.println("## Case 1: x+y == 2");
            int x = 1;
            int y = 1;
            assertEquals(2, x+y);
            System.out.println("PASSED");
        } catch(AssertionError ae) {
            System.out.println("FAILED");
        }
        try {
            System.out.println("## Case 2: x-y == 1");
            int x = 1;
            int y = 1;
            assertEquals(1, x-y);
            System.out.println("PASSED");
        } catch(AssertionError ae) {
            System.out.println("FAILED");
        }
    }
}
