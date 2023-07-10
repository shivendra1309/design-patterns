import creational.singleton.*;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
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

        SerializedInitialization instanceSI = SerializedInitialization.getInstance();
        ObjectOutput out = new ObjectOutputStream(new FileOutputStream("filename1.ser"));
        out.writeObject(instanceSI);
        out.close();

        //deserialize from file to object
        ObjectInput in = new ObjectInputStream(new FileInputStream("filename1.ser"));
        SerializedInitialization instanceSI2 = (SerializedInitialization) in.readObject();
        in.close();

        System.out.println("instanceSI hashcode= " + instanceSI.hashCode());
        System.out.println("instanceSI2 hashcode= " + instanceSI2.hashCode());
    }
}