package uutf;

public abstract class TestCase extends Test {

    @Override
    protected final void run(ResultCollector rc) {
        TestResult result = new TestResult(this.getClass().getCanonicalName());
        try {
            setUp();
            test();
            result.setStatus(STATUS.PASSED);
        } catch (AssertionError ae) {
            result.setStatus(STATUS.FAILED);
        } catch (Exception e) {
            result.setStatus(STATUS.ERRORED);
        } finally {
            tearDown();
        }
        rc.addResult(result);
    }

    protected void setUp() { }
    protected abstract void test();
    protected void tearDown() { }

}
