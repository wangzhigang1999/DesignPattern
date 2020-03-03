public class App {
    public static void main(String[] args) {
        WebSiteFactory webSiteFactory = new WebSiteFactory();
        User user = new User("wang");

        WebSite java = webSiteFactory.getWebSite("java");
        java.use(user);

        WebSite webSite = webSiteFactory.getWebSite("java");

        System.out.println(java == webSite);

        System.out.println(webSiteFactory.getWebSiteCount());
    }
}
