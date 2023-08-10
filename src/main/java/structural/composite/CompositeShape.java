package structural.composite;

import java.util.ArrayList;
import java.util.List;

public class CompositeShape implements Shape{
    private List<Shape> shapes = new ArrayList<>();

    public void addShape(Shape shape){
        shapes.add(shape);
    }

    @Override
    public String draw() {
        System.out.println("Drawing a composite shape");
        for(Shape shape : shapes){
            shape.draw();
        }
        return "Drawing a composite shape";
    }
}
