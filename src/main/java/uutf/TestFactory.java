package uutf;

import java.lang.reflect.Method;

public class TestFactory {

    private static final String TEST_METHOD_PREFIX = "test_";

    public Test scan(Class klass) {
        if (! isATestCase(klass))
            return new TestSuite();
        try {
            return extractTests(klass);
        } catch (Exception e) {
            return new TestSuite();
        }
    }

    private Test extractTests(Class klass) throws Exception {
        TestSuite suite = new TestSuite();
        for(Method m: klass.getMethods()) {
            if (m.getName().startsWith(TEST_METHOD_PREFIX)) {
                buildTestCase(klass, suite, m);
            }
        }
        return suite;
    }

    private void buildTestCase(Class klass, TestSuite suite, Method m)
            throws Exception {
        TestCase tc =
                (TestCase) klass.getDeclaredConstructor().newInstance();
        suite.addTest(tc.initialize(m.getName()));
    }

    private boolean isATestCase(Class klass) {
        return TestCase.class.isAssignableFrom(klass);
    }

}
