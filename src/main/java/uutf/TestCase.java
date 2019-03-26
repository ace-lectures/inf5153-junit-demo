package uutf;

public abstract class TestCase {


    public void run() {
        try {
            System.out.print("## Case " + this.getClass().getCanonicalName() + " ");
            test();
            System.out.println("[X]");
        } catch (AssertionError ae) {
            System.out.println("[ ]");
        } catch (Exception e) {
            System.out.println("[!]");
        }
    }

    protected abstract void test();

}
