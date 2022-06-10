package FactoryMethod.ShapesProblem;

public class Client {
    Shape myShape;

    Client() {
        myShape = ShapeFactory.getObject(ShapeType.CIRCLE);
    }

    Shape getShape() {
        return myShape;
    }

}

