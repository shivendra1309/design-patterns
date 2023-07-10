package creational.singleton;

public class ThreadSafeInitialization {
    private static ThreadSafeInitialization instance;

    private ThreadSafeInitialization(){}

    public static synchronized ThreadSafeInitialization getInstance(){
        if(instance == null){
            instance = new ThreadSafeInitialization();
        }
        return instance;
    }
}
