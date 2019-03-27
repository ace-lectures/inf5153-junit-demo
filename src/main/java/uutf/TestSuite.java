package uutf;

import java.util.HashSet;
import java.util.Set;

public class TestSuite extends Test {

    private Set<Test> cases = new HashSet<>();

    protected void addTest(Test t) { this.cases.add(t); }

    @Override
    protected void run(ResultCollector rc) {
        for(Test t: this.cases)
            t.run(rc);
    }

}
