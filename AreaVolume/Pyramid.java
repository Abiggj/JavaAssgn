package AreaVolume;
import java.lang.Math;


public class Pyramid extends Shape implements Volume{
    float height, width, length;

    Pyramid(){
        System.out.println("Enter the height: ");
        height = sc.nextFloat();
        System.out.println("Enter the width: ");
        width = sc.nextFloat();
        System.out.println("Enter the length: ");
        length = sc.nextFloat();
    }

    @Override
    public void calculateVolume() {
        volume = (float) ((length * width * height) / 3.0);
    }

    @Override
    public void calculateArea() {
        area = length * width;
        area += length * Math.sqrt((Math.pow((width /2),2) + (height * height)));
        area += width * Math.sqrt((Math.pow((length /2),2) + (height * height)));
    }



}
