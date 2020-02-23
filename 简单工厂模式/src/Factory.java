public class Factory {
    public static void main(String[] args) {
        Pizza pizza = PizzaFactory.getPizza("asd");
        if (pizza==null){
            System.out.println("没有这种pizza, 订购失败!");
        }else {
            System.out.println(pizza.name);
        }

    }
}

class PizzaFactory {
    public static Pizza getPizza(String pizzaName) {
        return pizzaName.equals("Chinese") ? new ChinesePizza() : pizzaName.equals("Japan") ? new Japan() : null;
    }
}
