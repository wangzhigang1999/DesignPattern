public class PopCorn {
    private static PopCorn INSTANCE;

    public static PopCorn getInstance() {
        if (INSTANCE == null) {
            synchronized (PopCorn.class) {
                if (INSTANCE == null) {
                    INSTANCE = new PopCorn();
                }
            }
        }
        return INSTANCE;
    }

    public void on() {
        System.out.println("打开 爆米花机");
    }

    public void off() {
        System.out.println("关闭了 爆米花机");
    }

    public void start() {
        System.out.println("开始做爆米花");
    }

    public void pause() {
        System.out.println("爆米花机停止工作");
    }
}
