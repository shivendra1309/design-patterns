package creational.abstractfactory;

public class WindowsCheckbox implements Checkbox{
    @Override
    public void draw(){
        System.out.println("Drawing a windows checkbox");
    }
}
