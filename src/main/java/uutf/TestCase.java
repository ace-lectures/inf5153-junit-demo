package uutf;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public abstract class TestCase extends Test {


    private String testMethodName;

    public TestCase initialize(String testMethodName) {
        this.testMethodName = testMethodName;
        return this;
    }

    @Override
    protected void run(ResultCollector rc) {
        TestResult result =
                new TestResult(this.getClass().getCanonicalName()+"::"+testMethodName);
        try {
            setUp();
            invokeTestMethod();
            result.setStatus(STATUS.PASSED);
        } catch (InvocationTargetException ite) {
            if (ite.getTargetException() instanceof AssertionError)
                result.setStatus(STATUS.FAILED);
            else
                result.setStatus(STATUS.ERRORED);
        } catch (Exception e) {
            result.setStatus(STATUS.ERRORED);
        } finally {
            tearDown();
        }
        rc.addResult(result);
    }

    private void invokeTestMethod() throws Exception {
        Method tm = this.getClass().getMethod(testMethodName);
        tm.invoke(this);
    }

    public void setUp() { }
    public void tearDown() { }

}
