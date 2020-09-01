public class MySingleton {

    public static MySingleton _instance = new MySingleton();

    private MySingleton() {

    }

    public static MySingleton getInstance() {
        return _instance;
    }
}