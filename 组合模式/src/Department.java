public class Department extends Organization {
    public Department(String name, String describe) {
        super(name, describe);
    }

    @Override
    protected void print() {
        System.out.println("----------" + getName() + "----------");
    }


}
