package Prototype.ShapeExample;

abstract class Shape {
    int X;
    int Y;
    String color;

    public int getX() {
        return X;
    }

    public void setX(int x) {
        X = x;
    }

    public int getY() {
        return Y;
    }

    public void setY(int y) {
        Y = y;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    Shape(){}

    Shape (Shape shape){
        this();
        this.X = shape.X;
        this.Y= shape.Y;
        this.color = shape.color;
    }

    public abstract Shape clone();
}
