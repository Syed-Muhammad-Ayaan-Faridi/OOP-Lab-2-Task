package com.SMAF;

import java.util.Scanner;

public class Lec1 {
    public static void main(String[] args) {
        double Num1, Num2, product = 0 ;
        Scanner Num = new Scanner(System.in);
        System.out.print("Enter Number: ");
        Num1 = Num.nextInt();
        System.out.print("Enter Number: ");
        Num2 = Num.nextInt();
        product = Num2*Num1;
        System.out.println("The percentage is : "+product);
    }
}
