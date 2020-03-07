public class Women extends Person {
    @Override
    public void accept(Action action) {
        action.getWomanResult(this);
    }
}
