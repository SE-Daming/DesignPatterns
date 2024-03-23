package Strategy;

import Strategy.ConcreteStrategy.AddOperation;
import Strategy.ConcreteStrategy.MultiOperation;
import Strategy.ConcreteStrategy.SubOperation;

public class test {
    public static void main(String[] args) {
        Context context=new Context(new AddOperation());
        int i = context.executeStrategy(10, 5);

        Context context1=new Context(new SubOperation());
        int i1 = context1.executeStrategy(10, 2);

        Context context2=new Context(new MultiOperation());
        int i2 = context2.executeStrategy(6, 6);

        System.out.println("i:"+i+" i1:"+i1+" i2:"+i2);
    }
}
