package com.saikat;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your Principle : ");
        float principle = sc.nextFloat();

        System.out.print("Enter your rate in percentage: ");
        float rate = sc.nextFloat();

        System.out.print("Enter the time :");
        int time = sc.nextInt();

        float SimpleI = (principle * rate * time)/100 ;
        System.out.print("The simple interest is :"+SimpleI);
    }
}
