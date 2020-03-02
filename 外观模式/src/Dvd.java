public class Dvd {
    private static Dvd INSTANCE;


    /**
     * DCL 双重检锁,单例模式.
     */
    public static Dvd getInstance() {
        if (INSTANCE == null) {
            synchronized (Dvd.class) {
                if (INSTANCE == null) {
                    INSTANCE = new Dvd();
                }
            }
        }
        return INSTANCE;
    }

    public void on() {
        System.out.println("打开DVD");
    }

    public void off() {
        System.out.println("关闭了DVD");
    }

    public void play() {
        System.out.println("开始播放");
    }

    public void pause() {
        System.out.println("DVD停止工作");
    }
}
