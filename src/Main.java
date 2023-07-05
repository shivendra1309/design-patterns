import creational.singleton.EagerInitialization;
import creational.singleton.LazyInitialization;
import creational.singleton.StaticBlockInitialization;
import creational.singleton.ThreadSafeInitialization;

public class Main {
    public static void main(String[] args) {
       // EagerInitialization
        EagerInitialization instance1 = EagerInitialization.getInstance();
        EagerInitialization instance2 = EagerInitialization.getInstance();
        System.out.println(instance1 == instance2);
        System.out.println(instance1.equals(instance2));

        //StaticBlockInitialization
        StaticBlockInitialization instanceSBI = StaticBlockInitialization.getInstance();
        StaticBlockInitialization instanceSBI2 = StaticBlockInitialization.getInstance();
        System.out.println(instanceSBI2 == instanceSBI2);

        //LazyInitialization
        LazyInitialization instanceLI = LazyInitialization.getInstance();
        LazyInitialization instanceLI2 = LazyInitialization.getInstance();
        System.out.println(instanceLI == instanceLI2);

        //ThreadSafeInitialization
        ThreadSafeInitialization instanceTSI = ThreadSafeInitialization.getInstance();
        ThreadSafeInitialization instanceTSI2 = ThreadSafeInitialization.getInstance();
        System.out.println(instanceTSI == instanceTSI2);
    }
}