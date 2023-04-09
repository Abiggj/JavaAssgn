package AreaVolume;

public class Sphere extends Shape implements Volume{
    float radius;
    
    Sphere(){
        System.out.println("Enter the radius of the Sphere: ");
        radius = sc.nextFloat();

    }

    @Override
    public void calculateVolume() {
        volume = (float) (4 / 3 * 3.1415926 * radius * radius * radius);
        System.out.println("The volume of the sphere is: "+ volume);
    }

    @Override
    public void calculateArea() {
        area = (float)(4 * 3.1415926 * radius * radius);
        System.out.println("The area of the sphere is: "+area);
    }
}
