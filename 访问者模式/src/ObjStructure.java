import java.util.LinkedList;
import java.util.List;

public class ObjStructure {
    private List<Person> personList = new LinkedList<Person>();

    public void add(Person person) {
        personList.add(person);
    }

    public void remove(Person person) {
        personList.remove(person);
    }

    public void display(Action action) {
        for (Person p : personList) {
            p.accept(action);
        }
    }

}
