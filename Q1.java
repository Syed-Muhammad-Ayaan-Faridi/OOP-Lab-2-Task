package com.SMAF;

import java.util.Scanner;

public class Lec1 {
    public static void main(String[] args) {
        int marks, TotalMarks = 0;
        float Percentage;
        Scanner marksint = new Scanner(System.in);
        for (int i = 0; i < 5 ; i++){
            System.out.println("Enter your marks out of 100: ");
            marks = marksint.nextInt();
            TotalMarks += marks;
        }
        Percentage = (TotalMarks/500f)*100;
        System.out.println("The percentage is : "+Percentage+"%");
    }
}
