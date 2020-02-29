public class Candle extends Decorator {
    Sweet sweet;

    public Candle(Sweet sweet) {
        this.sweet = sweet;
        this.description = "蜡烛";
    }

    @Override
    public String getDescription() {
        return sweet.getDescription() + "，" + this.description;
    }

    @Override
    public double cost() {
        return sweet.cost() + 10;
    }
}
