import java.util.Iterator;

public interface College {
    String getName();

    void AddDepart(String name, String description);

    Iterator createIterator();
}
