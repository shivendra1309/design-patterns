package creational.singleton;

public enum EnumInitialization {
    INSTANCE;

    private EnumInitialization(){}

    public void doSomething(){
        System.out.println("do something");
        System.out.println("do something");
    }
}
//enum instance is automatically loaded when the application loads hence no need for a constructor or new keyword