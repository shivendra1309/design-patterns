package creational.abstractfactory;

public class MacOSButton implements Button{
    @Override
    public void draw(){
        System.out.println("Drawing a macOS button");
    }
}
