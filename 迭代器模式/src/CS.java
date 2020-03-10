import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CS implements College {
    private List<Department> departments;

    public CS() {
        departments = new ArrayList<>(10);
    }

    @Override
    public String getName() {
        return "计算机学院";
    }

    @Override
    public void AddDepart(String name, String description) {
        departments.add(new Department(name, description));
    }

    @Override
    public Iterator<Department> createIterator() {
        return new CsIterator(departments);
    }
}
