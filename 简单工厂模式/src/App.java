import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Order order = new Order();
    }
}


class Order {
    public Order() {
        Scanner scanner = new Scanner(System.in);

        Pizza pizza;
        do {
            System.out.println("请输入pizza的类型 : Chinese or Japan !");
            String type = scanner.next();
            if (type.equals("Chinese")) {
                pizza = new ChinesePizza();
            } else if (type.equals("Japan")) {
                pizza = new Japan();
            } else {
                break;
            }
            pizza.prepare();
            pizza.buySomething();
            pizza.bake();
            pizza.cut();
            pizza.box();
        } while (true);
    }
}


abstract class Pizza {
    protected String name;

    abstract void prepare();

    public void setName(String name) {
        this.name = name;
    }

    public void buySomething() {
        System.out.println("购买了" + name + "的材料");
    }

    public void bake() {
        System.out.println("烘烤了" + name);
    }

    public void cut() {
        System.out.println("分割了" + name);
    }

    public void box() {
        System.out.println("打包了" + name);
    }

}

class ChinesePizza extends Pizza {

    @Override
    void prepare() {
        System.out.println("准备了ChinesePizza的原材料!");
    }

    public ChinesePizza() {
        this.setName("ChinesePizza");
    }
}

class Japan extends Pizza {

    @Override
    void prepare() {
        System.out.println("准备了ChinesePizza的原材料!");
    }

    public Japan() {
        this.setName("JapanPizza");
    }
}