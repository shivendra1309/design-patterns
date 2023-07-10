package creational.singleton;

public class DoubleCheckedLockingPrincipleInitialization {
    private static DoubleCheckedLockingPrincipleInitialization instance;

    private DoubleCheckedLockingPrincipleInitialization(){}

    private static DoubleCheckedLockingPrincipleInitialization getInstance(){
        if(instance == null){
            synchronized (DoubleCheckedLockingPrincipleInitialization.class){
                if(instance==null){
                    instance = new DoubleCheckedLockingPrincipleInitialization();
                }
            }
        }
        return instance;
    }
//    The reason why the two if conditions are necessary is to prevent the following scenario from happening:
//
//    Thread 1 enters the first if condition and sees that the instance of the singleton class is not yet created.
//    Thread 1 acquires a lock on the singleton class and starts initializing it.
//    Thread 2 enters the first if condition and also sees that the instance of the singleton class is not yet created.
//    Thread 2 does not check the second if condition, so it creates a new instance of the singleton class.
//    This would result in two instances of the singleton class being created, which is not what we want. The second if condition prevents this
//    from happening by ensuring that only one thread can initialize the singleton class at a time.

//    It is important to note that double-checked locking is not guaranteed to work in all cases. For example, it can be broken if the singleton class
//    is not volatile. In Java 5 and later, the volatile keyword ensures that the value of the instance variable is always visible to all threads.
//    However, in Java 4 and earlier, the value of the instance variable may not be visible to all threads, which could lead to the creation of multiple instances
//    of the singleton class.
//
//    For this reason, it is generally not recommended to use double-checked locking in Java 4 and earlier. If you need to ensure that only one instance of
//    a class is created in a multithreaded environment, then you should use a different approach, such as the eager initialization
//    pattern or the static factory method pattern.
//
}
