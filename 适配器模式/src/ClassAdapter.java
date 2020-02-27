/**
 * @author wangz
 * 对象适配器
 */
public class ClassAdapter {
    public static void main(String[] args) {
        new Phone().Charge(new Adapter(new Voltage220()));
    }
}


class Voltage220 {
    int voltage = 220;

    public int getVoltage() {
        System.out.println("电压等于 " + voltage);
        return voltage;
    }
}


interface Voltage5 {
    public int outPut();
}


class Adapter implements Voltage5 {
    private Voltage220 voltage220;

    public Adapter(Voltage220 voltage220) {
        this.voltage220 = voltage220;
    }

    @Override
    public int outPut() {
        int voltage = voltage220.getVoltage();
        System.out.println("适配器开始工作...");
        return voltage / 44;
    }
}

class Phone {
    public void Charge(Voltage5 voltage) {
        if (voltage.outPut() == 5) {
            System.out.println("充电中...");
        } else {
            System.out.println("充电失败...");
        }
    }
}