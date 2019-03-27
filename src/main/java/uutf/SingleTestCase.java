package uutf;

public abstract class SingleTestCase extends TestCase {

    private static final String DEFAULT_TEST_METHOD = "test";

    public SingleTestCase() { initialize(DEFAULT_TEST_METHOD); }

    public abstract void test();

}
