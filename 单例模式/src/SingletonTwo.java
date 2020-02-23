/**
 * @author wangz
 * 双重检测锁
 */
public class SingletonTwo {
    private volatile static SingletonTwo INSTANCE;

    private SingletonTwo() {

    }

    public static SingletonTwo getInstance() {
        if (INSTANCE == null) {
            synchronized (SingletonTwo.class) {
                if (INSTANCE == null) {
                    INSTANCE = new SingletonTwo();
                }
            }
        }
        return INSTANCE;
    }
}


class Test1 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            new Thread(() -> System.out.println(SingletonTwo.getInstance())).start();
        }
    }
}