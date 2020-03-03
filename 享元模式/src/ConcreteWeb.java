public class ConcreteWeb extends WebSite {
    private String type;

    public ConcreteWeb(String type) {
        this.type = type;
    }

    @Override
    public void use(User user) {
        System.out.println("网站的发布形式为 : " + type + " 使用的用户为 : " + user.getName());
    }

}
