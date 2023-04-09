package AreaVolume;

public class Square extends Shape
{
    float side;
    @Override
    public void calculateArea() {
        System.out.println("Enter the length");
        side = sc.nextFloat();
        area = side * side;
        
        System.out.println("Area of Square is l**2 "+area);


    }
}
