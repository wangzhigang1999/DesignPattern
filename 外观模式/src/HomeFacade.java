public class HomeFacade {
    private Dvd dvd;
    private PopCorn popCorn;

    public HomeFacade() {
        dvd = Dvd.getInstance();
        popCorn = PopCorn.getInstance();
    }

    public void ready() {
        dvd.on();
        popCorn.on();
    }

    public void start(){
        dvd.play();
        popCorn.start();
    }

    public void pause(){
        dvd.pause();
        popCorn.pause();
    }

    public void end(){
        dvd.off();
        popCorn.off();
    }
}
