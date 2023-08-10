package structural.composite;

public class Circle implements Shape{
    @Override
    public String draw() {
        System.out.println("Drawing a square");
        return "Drawing a circle";

    }
}
