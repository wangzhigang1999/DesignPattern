import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Order Chinese = new Chinese();
        Order Japan = new Japan();
    }
}

abstract class Pizza {
    protected String name;

    protected void setName(String name) {
        this.name = name;
    }

    public void box() {
        System.out.println("打包了" + name);
    }

}

class ChineseRed extends Pizza {
    public ChineseRed() {
        this.setName("ChineseRedPizza");
    }
}

class ChineseBlue extends Pizza {
    public ChineseBlue() {
        this.setName("ChineseBluePizza");
    }
}

class JapanRed extends Pizza {
    public JapanRed() {
        this.setName("JapanRedPizza");
    }
}

class JapanBlue extends Pizza {
    public JapanBlue() {
        this.setName("JapanBluePizza");
    }
}


abstract class Order {
    public Order() {
        System.out.println("当前的工厂是" + getClass().getName());
        System.out.println("请输入pizza的种类, Red/Blue :");
        Pizza pizza = createPizza(new Scanner(System.in).next());
        pizza.box();
    }

    abstract public Pizza createPizza(String pizza);

}


class Chinese extends Order {
    @Override
    public Pizza createPizza(String pizza) {
        if (pizza.equals("Red")) {
            return new ChineseRed();
        } else if (pizza.equals("Blue")) {
            return new ChineseBlue();
        } else {
            return null;
        }
    }
}

class Japan extends Order {
    @Override
    public Pizza createPizza(String pizza) {
        if (pizza.equals("Red")) {
            return new JapanRed();
        } else if (pizza.equals("Blue")) {
            return new JapanBlue();
        } else {
            return null;
        }
    }
}