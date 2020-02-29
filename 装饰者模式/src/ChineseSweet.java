public class ChineseSweet extends Sweet {
    public ChineseSweet() {
        this.description = "中式蛋糕";
    }

    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public double cost() {
        return 66;
    }
}
