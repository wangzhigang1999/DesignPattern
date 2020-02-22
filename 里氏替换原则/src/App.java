public class App {
    public static void main(String[] args) {
        System.out.println(new A().add(1, 2));
    }
}

class A {
    public int add(int a, int b) {
        return a + b;
    }
}

