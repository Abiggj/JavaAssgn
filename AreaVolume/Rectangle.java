package AreaVolume;

public class Rectangle extends Shape
{
    double length;
    double breadth;
    public void calculateArea()
    {
        System.out.println("Enter the length");
        length = sc.nextFloat();
        System.out.println("Enter the breadth");
        breadth = sc.nextFloat();
        area = (float) (length * breadth);
        System.out.println("Area of Rectangle is "+area);

    }
}