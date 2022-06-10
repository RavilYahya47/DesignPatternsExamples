package Prototype.ShapeExample;

public class Circle extends Shape{
    private int radius;

    public Circle() {
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    Circle (Circle source){
        super(source);
        this.radius = source.radius;

    }

    @Override
    public Circle clone() {
        return new Circle(this);
    }
}
