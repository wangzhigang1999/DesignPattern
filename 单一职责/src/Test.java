/**
 * @author wangz
 */
public class Test {
    public static void main(String[] args) {
        new Run().carRun("汽车");
        new Run().trainRun("火车");
        new Run().planeRun("飞机");
    }
}

class Run {
    public void carRun(String name) {
        System.out.println(name + "在陆地上跑");
    }

    public void trainRun(String name) {
        System.out.println(name + "在铁道上跑");
    }

    public void planeRun(String name) {
        System.out.println(name + "在天上飞");
    }
}

class CarRun {
    public void run(String name) {
        System.out.println(name + "在陆地上跑");
    }
}

class TrainRun {
    public void run(String name) {
        System.out.println(name + "在铁轨上跑");
    }
}

class PlaneRun {
    public void run(String name) {
        System.out.println(name + "在天上飞");
    }
}


