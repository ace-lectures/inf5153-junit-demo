package uutf;


public class TestRunner {

    public void runAndPrint(Test t) {
        System.out.println(this.run(t));
    }

    public ResultCollector run(Test t) {
        ResultCollector rc = new ResultCollector();
        t.run(rc);
        return rc;
    }

}
