public class SingletonFour {

    public static void main(String[] args) {
        System.out.println(Singleton.INSTANCE);
    }

}

enum Singleton {
    INSTANCE
}