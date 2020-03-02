public class App {
    public static void main(String[] args) {
        HomeFacade homeFacade = new HomeFacade();
        System.out.println("==========");
        homeFacade.ready();
        System.out.println("==========");
        homeFacade.start();
        System.out.println("==========");
        homeFacade.pause();
        System.out.println("==========");
        homeFacade.end();
        System.out.println("==========");
    }
}
