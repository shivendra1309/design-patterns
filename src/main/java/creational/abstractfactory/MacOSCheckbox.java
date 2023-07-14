package creational.abstractfactory;

public class MacOSCheckbox implements Checkbox {

    @Override
    public void draw() {
        System.out.println("Drawing a macOS checkbox");
    }
}
