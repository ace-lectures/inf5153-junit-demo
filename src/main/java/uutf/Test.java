package uutf;

public abstract class Test {

    final void run() {
        ResultCollector rc = new ResultCollector();
        this.run(rc);
        System.out.println(rc);
    }

    protected abstract void run(ResultCollector rc);

}
