package creational.abstractfactory;

public class WindowsButton implements Button{
    @Override
    public void draw(){
        System.out.println("Drawing a windows Button");
    }
}
