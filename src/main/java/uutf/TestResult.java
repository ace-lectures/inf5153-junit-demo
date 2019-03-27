package uutf;

public class TestResult {

    private String name;
    private STATUS status;

    public TestResult(String name) {
        this.name = name;
    }

    public void setStatus(STATUS status) {
        this.status = status;
    }

    public STATUS getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "## " + status + " " + name;
    }
}
