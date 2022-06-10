package FactoryMethod.ShapesProblem;

public class Main {
    public static void main(String[] args) {

        Client c1 = new Client();
        Shape s = c1.getShape();
        s.draw();
    }
}
