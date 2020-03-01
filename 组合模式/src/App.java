public class App {
    public static void main(String[] args) {

        University university = new University("Bupt", "北京邮电大学");

        College college = new College("Cs", "计算机");
        college.add(new Department("教务处", "计算机学院教务处"));

       university.add(college);

        university.print();
    }
}

