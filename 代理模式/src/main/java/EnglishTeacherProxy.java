public class EnglishTeacherProxy implements Teacher {
    private Teacher teacher;

    public EnglishTeacherProxy(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public void teach() {
        System.out.println("代理开始");
        teacher.teach();
        System.out.println("代理结束");
    }
}
