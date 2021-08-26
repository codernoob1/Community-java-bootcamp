package com.saikat;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius:");
        float r = sc.nextFloat();

        System.out.println("The circumference of circle is : "+circumference(r));
        System.out.println("The Area of circle is : "+Area(r));
    }
    static double circumference(float r){
        return 2*Math.PI*r;
    }
    static double Area (float r){
        return Math.PI*r*r;
    }
}
