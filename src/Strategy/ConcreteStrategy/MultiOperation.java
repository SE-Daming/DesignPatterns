package Strategy.ConcreteStrategy;

import Strategy.Strategy;

public class MultiOperation implements Strategy {
    @Override
    public int operation(int a, int b) {
        return a*b;
    }
}
