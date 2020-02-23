public class SingletonThree {

    private SingletonThree() {
    }

    private static class A {
        private static final SingletonThree singletonThree = new SingletonThree();
    }

    public static SingletonThree getINSTANCE() {
        return A.singletonThree;
    }
}

class Test2{
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            new Thread(() -> System.out.println(SingletonThree.getINSTANCE())).start();
        }

    }
}