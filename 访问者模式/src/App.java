/**
 * 比较抽象的模式,不建议经常使用
 */
public class App {
    public static void main(String[] args) {
        ObjStructure objStructure = new ObjStructure();

        objStructure.add(new Man());
        objStructure.add(new Man());
        objStructure.add(new Man());

        Success success = new Success();
        objStructure.display(success);

        Fail fail = new Fail();
        objStructure.display(fail);

    }
}
