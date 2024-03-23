package Strategy.ConcreteStrategy;


import Strategy.Strategy;

public class SubOperation implements Strategy {
    @Override
    public int operation(int a, int b) {
        return a-b;
    }
}
