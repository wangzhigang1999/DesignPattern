public abstract class Milk {


    final void make() {
        select();
        addSomething();
        beating();
    }

    abstract void select();

    abstract void addSomething();

    private void beating() {
        System.out.println("正在打浆");
    }

}


