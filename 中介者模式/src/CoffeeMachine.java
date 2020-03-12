public class CoffeeMachine extends Colleague {

    public CoffeeMachine(Mediator mediator, String name) {
        super(mediator, name);
        mediator.Register(name, this);
    }

    @Override
    public void SendMessage(int stateChange) {
        this.GetMediator().GetMessage(stateChange, this.name);
    }

    public void StartCoffee() {
        System.out.println("打开了咖啡机 ! ");
    }

    public void FinishCoffee() {

        System.out.println("咖啡制作完毕,用时 5 分钟 .");
        SendMessage(0);
    }
}
