package com.saikat;

import java.util.Scanner;

public class SumOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number:");
        int n1 = sc.nextInt();

        System.out.print("Enter second number:");
        int n2 = sc.nextInt();

        int result = sum(n1,n2);
        System.out.print("The sum of two numbers: "+result);
    }
    static int sum(int num1,int num2){
        return num1 + num2 ;
    }
}
