/**
 * @author wangz
 */
public class App {
    public static void main(String[] args) {
        new DrawShape().draw(new Rectangle());
        new DrawShape().draw(new Circle());
    }
}


abstract class Shape {
    int type;

    abstract public void draw();
}

class Rectangle extends Shape {
    Rectangle() {
        super.type = 1;
    }

    @Override
    public void draw() {
        System.out.println("绘制矩形");
    }
}

class Circle extends Shape {
    public Circle() {
        super.type = 2;
    }

    @Override
    public void draw() {
        System.out.println("绘制三角形");
    }
}

class DrawShape {
    public void draw(Shape shape) {
        shape.draw();
    }
}