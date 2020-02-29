public class Fruit extends Decorator {
    Sweet sweet;

    public Fruit(Sweet sweet) {
        this.sweet = sweet;
        this.description="水果";
    }

    @Override
    public String getDescription() {
        return sweet.getDescription() +  this.description;
    }

    @Override
    public double cost() {
        return sweet.cost() + 10;
    }
}
