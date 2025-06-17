public class Singleton {
    private static Singleton instance = null;

    private Singleton () {
        // The constructor is private...
    }

    public static synchronized Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}
