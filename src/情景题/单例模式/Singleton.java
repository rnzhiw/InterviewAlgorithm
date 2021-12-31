package 情景题.单例模式;

/**
 * Created with IntelliJ IDEA.
 *
 * 双重校验锁实现单例模式
 * https://www.iamshuaidi.com/1082.html
 *
 * @Author: rnzhiw
 * @Description:
 */
public class Singleton {

    private volatile static Singleton uniqueInstance;

    public Singleton() {

    }

    public static Singleton getUniqueInstance() {
        if(uniqueInstance == null) {
            synchronized (Singleton.class) {
                if(uniqueInstance == null) {
                    uniqueInstance = new Singleton();
                }
            }
        }
        return uniqueInstance;
    }


}
