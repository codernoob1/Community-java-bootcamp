package com.saikat;

import java.util.Scanner;

public class ProductTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        float n1 = sc.nextFloat();

        System.out.print("Enter second number: ");
        float n2 = sc.nextFloat();

        float result = product(n1,n2);
        System.out.print("The product of two numbers: "+result);
    }
    static float product(float num1, float num2){
        return num1 * num2;
    }
}
