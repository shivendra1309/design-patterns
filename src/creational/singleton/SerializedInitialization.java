package creational.singleton;

import java.io.Serializable;

public class SerializedInitialization implements Serializable {
    private static final long serialVersionUID = -7604766932017737115L;

    private SerializedInitialization(){}

    private static class SingletonHelper{
        private static final SerializedInitialization instance = new SerializedInitialization();
    }

    public static SerializedInitialization getInstance(){
        return SingletonHelper.instance;
    }
    //problem - it will create a new instance when we deserialize it.
    //remedy  - implementation of readResolve

    protected Object readResolve() {
        return getInstance();
    }

}

