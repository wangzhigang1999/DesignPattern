public class App {
    public static void main(String[] args) {
        Teacher instance = (Teacher) new CglibProxy(new EnglishTeacher()).getInstance();
        instance.teach();

    }
}

