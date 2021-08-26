package com.saikat;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int num = sc.nextInt();
        System.out.println("The factorial of the entered number: "+Factorials(num));
    }
    static int Factorials(int n){
        int fact = 1;
        for (int i = 1; i <=n ; i++) {
            fact*=i;
        }
        return fact;
    }
}
