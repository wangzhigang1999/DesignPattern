public class DynamicProxy {
    public static void main(String[] args) {
        Teacher proxyInstance = (Teacher) new ProxyFactory(new EnglishTeacher()).getProxyInstance();
        proxyInstance.teach();

    }
}

