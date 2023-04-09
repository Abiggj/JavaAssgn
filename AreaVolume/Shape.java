package AreaVolume;

import java.util.Scanner;

abstract public class Shape
{
    static Scanner sc = new Scanner(System.in);
    float volume;
    float area;
    public void stateShape(String shape)
    {
        System.out.println("The shape is"+shape);
    }
    abstract public void calculateArea();

}
