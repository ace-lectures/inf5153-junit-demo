package uutf;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class TestRunner {

    private Set<TestCase> cases = new HashSet<>();

    public void addCase(TestCase tc) {
        this.cases.add(tc);
    }

    public void run() {
        Map<STATUS, Integer> counters = new HashMap<>();
        Set<TestResult> results = new HashSet<>();
        for(TestCase tc: cases) {
            TestResult r = tc.run();
            counters.put(r.getStatus(), counters.getOrDefault(r.getStatus(),0)+1);
            results.add(r);
        }
        results.forEach(System.out::println);
        System.out.println(counters);
    }


}
