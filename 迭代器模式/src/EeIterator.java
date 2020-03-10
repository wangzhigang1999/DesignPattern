import java.util.Iterator;

public class EeIterator implements Iterator<Department> {

    Department[] departments;
    private int index = 0;

    public EeIterator(Department[] departments) {
        this.departments = departments;
    }

    @Override
    public boolean hasNext() {
        return index < departments.length && departments[index] != null;
    }

    @Override
    public Department next() {
        Department department = departments[index];
        index++;
        return department;
    }
}
