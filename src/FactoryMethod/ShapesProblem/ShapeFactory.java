package FactoryMethod.ShapesProblem;

public abstract class ShapeFactory {
    public static Shape getObject(ShapeType shapeType){
        if(shapeType == ShapeType.CIRCLE)
            return new Circle();
        else if(shapeType==ShapeType.RECTANGLE)
            return new Rectangle();
        else if(shapeType==ShapeType.SQUARE)
            return new Square();
        else return null;
    }
}
