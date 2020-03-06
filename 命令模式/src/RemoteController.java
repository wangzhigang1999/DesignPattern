public class RemoteController {
    private Command[] onCommands;
    private Command[] offCommands;
    private Command undoCommand;

    /**
     * 初始化一个空的遥控器
     */
    public RemoteController() {
        onCommands = new Command[5];
        offCommands = new Command[5];

        for (int i = 0; i < 5; i++) {
            onCommands[i] = new NoCommand();
            offCommands[i] = new NoCommand();
        }
    }

    public void setCommands(int number, Command onCommand, Command offCommand) {
        onCommands[number] = onCommand;
        offCommands[number] = offCommand;
    }

    public void onButtonPushed(int number) {
        onCommands[number].execute();
        undoCommand = onCommands[number];
    }

    public void OffButtonPushed(int number) {
        offCommands[number].execute();
        undoCommand = offCommands[number];
    }

    public void undoButtonPushed() {
        undoCommand.undo();
    }
}
