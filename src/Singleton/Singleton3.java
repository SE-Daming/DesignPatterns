package Singleton;

/**
 * 双重null检查
 */
public class Singleton3 {
    //volatile修饰为了禁止指令重排序优化、保证instance的可见性
    private static volatile Singleton3 instance;
    private Singleton3(){}
    public static Singleton3 getInstance(){
        if(instance==null){
            synchronized (Singleton3.class){
                if(instance==null){
                    instance=new Singleton3();
                }
            }
        }
        return instance;
    }
}
