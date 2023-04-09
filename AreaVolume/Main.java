package AreaVolume;

public class Main {
    public static void main(String args[])
    {

        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();
        Square square = new Square();
        circle.stateShape("circle");
        circle.calculateArea();
        rectangle.calculateArea();
        square.calculateArea();
    }

}
