public class App {
    public static void main(String[] args) {

        LightReceiver lightReceiver = new LightReceiver();

        LightOnCommand lightOnCommand = new LightOnCommand(lightReceiver);
        LightOffCommand lightOffCommand = new LightOffCommand(lightReceiver);

        RemoteController controller = new RemoteController();

        controller.setCommands(0, lightOnCommand, lightOffCommand);


        controller.onButtonPushed(0);
        controller.undoButtonPushed();

        controller.OffButtonPushed(0);


    }
}

