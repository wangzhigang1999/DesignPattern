public class App {
    public static void main(String[] args) {
        ChineseSweet chineseCake = new ChineseSweet();
        System.out.println(chineseCake.getDescription() + " 总共花费 " + chineseCake.cost());

        Fruit fruit = new Fruit(chineseCake);
        System.out.println(fruit.getDescription() + " 总共花费 " + fruit.cost());

        Candle candle = new Candle(fruit);
        System.out.println(candle.getDescription() + " 总共花费 " + candle.cost());
    }
}

