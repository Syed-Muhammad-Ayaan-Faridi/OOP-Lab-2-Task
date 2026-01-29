package com.SMAF;
import java.lang.Math;
import java.util.Scanner;

public class Lec1 {
    public static void main(String[] args) {
        double Pi = 3.14159,Diameter, Radius, Circumference,Area ;
        Scanner Num = new Scanner(System.in);
        System.out.print("Enter Radius: ");
        Radius = Num.nextDouble();
        Diameter = Radius * 2;
        Circumference = 2*Pi*Radius;
        Area = Pi*Math.pow(Radius,2);
        System.out.println("The Radius is : "+Radius);
        System.out.println("The Diameter is : "+Diameter);
        System.out.println("The Circumference is : "+Circumference);
        System.out.println("The Area is : "+Area);
    }
}
