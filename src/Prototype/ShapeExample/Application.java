package Prototype.ShapeExample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Application {
    List<Shape> shapes = new ArrayList();
    public  Application(){
        Circle circle = new Circle();
        circle.setX(10);
        circle.setY(20);
        shapes.add(circle);

        Circle anotherCircle = circle.clone();
        shapes.add(anotherCircle);

        Rectangle rectangle =  new Rectangle();
        rectangle.setWidth(10);
        rectangle.setHeight(20);
    }


    void businnesLogic(){
        List<Shape> shapesCopy = new ArrayList<>();
        for(Shape shape:shapes)
            shapesCopy.add(shape.clone());
    }
}
