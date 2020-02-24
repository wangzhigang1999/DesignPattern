public class App {
    public static void main(String[] args) {
        new Order(new ChineseFactory()).getPizza("Red");
        new Order(new JapanFactory()).getPizza("Red");
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

interface Factory {
    Pizza createPizza(String pizza);
}

class Order {
    Factory factory;

    public Order(Factory factory) {
        this.factory = factory;
    }

    public void getPizza(String name) {
        factory.createPizza(name).box();
    }

}


class ChineseFactory implements Factory {
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

class JapanFactory implements Factory {
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