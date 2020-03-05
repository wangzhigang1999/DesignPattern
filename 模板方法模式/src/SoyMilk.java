public class SoyMilk extends Milk {

    @Override
    void select() {
        System.out.println("选择了大豆作为原材料");
    }

    @Override
    protected void addSomething() {
        System.out.println("加入了豆浆的调料");
    }
}

