package AreaVolume;

public class Circle extends Shape
{
    double radius;
    public void calculateArea()
    {
        System.out.println("Put the radius");

        radius = sc.nextDouble();
        area = (float)(2*Math.PI*radius*radius);
        System.out.println("Area of circle is "+area);

    }
}