package Prototype.ShapeExample;

public class Rectangle extends Shape{
    private int height;
    private int width;

    public Rectangle() {

    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    Rectangle (Rectangle source){
        super(source);
        this.width = source.width;
        this.height = source.height;
    }


    @Override
    public Rectangle clone() {
        return new Rectangle(this);
    }
}
