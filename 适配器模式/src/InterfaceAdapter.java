public class InterfaceAdapter {
    public static void main(String[] args) {
        new RealClass().a();
    }
}

interface AnInterface {
    public void a();

    public void b();

    public void c();

    public void d();
}


abstract class AbsClass implements AnInterface {

    @Override
    public void a() {

    }

    @Override
    public void b() {

    }

    @Override
    public void c() {

    }

    @Override
    public void d() {

    }
}

class RealClass extends AbsClass {
    @Override
    public void a() {
        System.out.println("这是真正的需要的 a 方法 ~");
    }
}