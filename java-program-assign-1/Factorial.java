package com.saikat;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long number = sc.nextLong();
        int fact = 1;
        for (int i = 1; i<=number;i++){
            fact*=i;
        }
        System.out.println("The factorial is :"+ fact);
    }
}
