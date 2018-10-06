package solution.strategy;

public class Context {

    private Strategy strategy;

    public void setStrategy(int strategy) {
        if (strategy == 1) {
            this.strategy = new Strategy1();
        } else if (strategy == 2) {
            this.strategy = new Strategy2();
        }
    }

    public Strategy getStrategy() {
        return strategy;
    }

}
