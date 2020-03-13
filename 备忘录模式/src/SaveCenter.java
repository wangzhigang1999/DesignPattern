import java.util.LinkedList;
import java.util.List;

/**
 * 对象保存中心
 */
public class SaveCenter {
    private List<Memento> mementos;

    public SaveCenter() {
        mementos = new LinkedList<>();
    }

    public void add(Memento memento) {
        mementos.add(memento);
    }

    public Memento getMemento(int index) {
        return mementos.get(index);
    }
}
