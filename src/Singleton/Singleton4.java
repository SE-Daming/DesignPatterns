package Singleton;

/**
 * 静态内部类
 */
public class Singleton4 {
    private Singleton4(){

    }
    private static class Singleton4Instance{
        private static final Singleton4 instance=new Singleton4();
    }
    public static Singleton4 getInstance(){
        return Singleton4Instance.instance;
    }
}
