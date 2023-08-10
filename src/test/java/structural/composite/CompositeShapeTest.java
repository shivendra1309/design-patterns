package structural.composite;

import org.junit.Test;

import static org.junit.Assert.*;

public class CompositeShapeTest {

    @Test
    public void TestComposite() throws Exception {
        CompositeShape compositeShape = new CompositeShape();
        Circle circle = new Circle();
        Sqaure sqaure = new Sqaure();
        compositeShape.addShape(new Circle());
        compositeShape.addShape(new Sqaure());
        compositeShape.draw();

    assertEquals( "Drawing a circle", circle.draw());
        assertEquals( "Drawing a square",sqaure.draw());
        assertEquals( "Drawing a composite shape",compositeShape.draw());

    }
}
