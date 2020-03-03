import java.util.HashMap;

public class WebSiteFactory {
    private HashMap<String, ConcreteWeb> pool = new HashMap<>();

    public WebSite getWebSite(String type) {
        if (!pool.containsKey(type)) {
            pool.put(type, new ConcreteWeb(type));
        }

        return pool.get(type);
    }

    public int getWebSiteCount() {
        return pool.size();
    }
}
