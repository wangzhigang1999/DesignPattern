/**
 * @author wangz
 */
public class Main {
    public static void main(String[] args) {
        new Person().receive(new Email());
    }
}

class Email implements Receiver {
    @Override
    public String getInfo() {
        return "msg";
    }
}

class Person {
    public void receive(Receiver receiver) {
        System.out.println(receiver.getInfo());
    }
}
