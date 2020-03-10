import java.util.Iterator;

public class EE implements College {

    private Department[] departments;
    private int nums = 0;

    public EE() {
        departments = new Department[10];
    }

    @Override
    public String getName() {
        return "电子院";
    }

    @Override
    public void AddDepart(String name, String description) {
        departments[nums++] = new Department(name, description);
    }

    @Override
    public Iterator<Department> createIterator() {
        return new EeIterator(departments);
    }
}
