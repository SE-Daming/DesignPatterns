package Strategy.ConcreteStrategy;

import Strategy.Strategy;

public class AddOperation implements Strategy {
    @Override
    public int operation(int a, int b) {
        return a+b;
    }
}
