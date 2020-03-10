import java.util.Iterator;
import java.util.List;

public class CsIterator implements Iterator<Department> {

    private List<Department> list;
    private int index = -1;


    public CsIterator(List<Department> list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return index < list.size() - 1;
    }

    @Override
    public Department next() {
        return list.get(++index);
    }
}
