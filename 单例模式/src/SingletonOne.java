/**
 * @author wangz
 * 饿汉式单例
 */
public class SingletonOne {
    private boolean flag = false;

    private SingletonOne() {
        if (flag == false) {
            flag = true;
        } else {
            System.out.println("不允许通过反射改变值...正在退出程序");
            System.exit(0);
        }
    }

    private final static SingletonOne INSTANCE = new SingletonOne();

    public static SingletonOne getInstance() {
        return INSTANCE;
    }
}

class Test {
    public static void main(String[] args) {
        SingletonOne instance = SingletonOne.getInstance();
        SingletonOne instance2 = SingletonOne.getInstance();
        System.out.println(instance == instance2);
    }
}