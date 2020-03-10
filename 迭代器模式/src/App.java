import java.util.Iterator;

public class App {
    public static void main(String[] args) {

        CS cs = new CS();
        cs.AddDepart("123", "456");
        cs.AddDepart("123", "456");
        cs.AddDepart("123", "456");
        cs.AddDepart("123", "456");
        cs.AddDepart("123", "456");

        Iterator<Department> csIterator = cs.createIterator();
        while (csIterator.hasNext()) {
            System.out.println(csIterator.next());
        }


        EE ee = new EE();
        ee.AddDepart("456", "123");
        ee.AddDepart("456", "123");
        ee.AddDepart("456", "123");
        ee.AddDepart("456", "123");
        ee.AddDepart("456", "123");
        Iterator<Department> eeIterator = ee.createIterator();
        while (eeIterator.hasNext()) {
            System.out.println(eeIterator.next());
        }


    }
}
