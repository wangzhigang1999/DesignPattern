public class App {
    public static void main(String[] args) {
        WoodenHouseBuilder woodenHouseBuilder = new WoodenHouseBuilder();
        House house = new HouseDirector(woodenHouseBuilder).constructHouse();
        House house2 = new HouseDirector(woodenHouseBuilder).constructHouse();
        System.out.println(house==house2);

    }
}

class House {

    String base;
    String color;
    String roof;

    @Override
    public String toString() {
        return "House{" +
                "base='" + base + '\'' +
                ", color='" + color + '\'' +
                ", roof='" + roof + '\'' +
                '}';
    }
}


abstract class HouseBuilder {
    protected House house = new House();

    public House getHouse() {
        return house;
    }

    abstract protected void buildBase();

    abstract protected void buildColor();

    abstract protected void buildRoof();
}


class WoodenHouseBuilder extends HouseBuilder {
    @Override
    protected void buildBase() {
        house.base = "木房子的地基";
    }

    @Override
    protected void buildColor() {
        house.color = "木纹";
    }

    @Override
    protected void buildRoof() {
        house.roof = "茅草屋顶";
    }
}

class HighHouseBuilder extends HouseBuilder {
    @Override
    protected void buildBase() {
        house.base = "高楼的地基";
    }

    @Override
    protected void buildColor() {

        house.color = "五彩斑斓的颜色";
    }

    @Override
    protected void buildRoof() {
        house.roof = "豪华屋顶";
    }
}


class HouseDirector {
    private HouseBuilder houseBuilder;

    public HouseDirector(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public void setHouseBuilder(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public House constructHouse() {
        houseBuilder.buildBase();
        houseBuilder.buildColor();
        houseBuilder.buildRoof();
        return houseBuilder.getHouse();
    }
}