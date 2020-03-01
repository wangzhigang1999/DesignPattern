import java.util.ArrayList;
import java.util.List;

public class University extends Organization {
    List<Organization> organizations = new ArrayList<>();

    public University(String name, String describe) {
        super(name, describe);
    }

    @Override
    protected void add(Organization organization) {
        organizations.add(organization);
    }

    @Override
    protected void remove(Organization organization) {
        organizations.remove(organization);
    }

    @Override
    protected void print() {
        System.out.println( "----------"+getName()+"----------");
        organizations.forEach(Organization::print);

    }
}


