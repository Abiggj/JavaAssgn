package AreaVolume;

public class Cylinder extends Shape implements Volume{
    float radius, height;

    Cylinder(){
        System.out.println("Enter the radius: ");
        radius = sc.nextFloat();
        System.out.println("Enter the Height: ");
        height = sc.nextFloat();
    }

    @Override
    public void calculateVolume() {
        volume = (float)(2.0 * 3.14 * radius * radius * height);
    }

    @Override
    public void calculateArea() {
        area =  (float) ((float)(2.0 * 3.14 * radius * height) + (2.0 * 3.14 * radius *radius));
    }
    
}
