public class App {
    public static void main(String[] args) {
        SaveCenter saveCenter = new SaveCenter();

        ObjectToBeSaved objectToBeSaved = new ObjectToBeSaved();
        System.out.println("========创建对象========");
        objectToBeSaved.setState("初始状态");
        System.out.println(objectToBeSaved.getState());

        System.out.println("========保存初始状态========");
        saveCenter.add(objectToBeSaved.saveStateMemento());
        System.out.println(objectToBeSaved.getState());


        System.out.println("========改变状态========");
        objectToBeSaved.setState("改变后的状态");
        System.out.println(objectToBeSaved.getState());


        System.out.println("========恢复状态========");
        objectToBeSaved.getStateFromMemento(saveCenter.getMemento(0));
        System.out.println(objectToBeSaved.getState());


        System.out.println("========恢复后的状态========");
        System.out.println(objectToBeSaved.getState());


    }
}
