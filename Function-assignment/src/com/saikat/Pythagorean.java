package com.saikat;

import java.util.Scanner;

public class Pythagorean {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int a = sc.nextInt();
        System.out.print("Enter second number : ");
        int b = sc.nextInt();
        System.out.print("Enter third number : ");
        int c = sc.nextInt();

        boolean result = isPythagorean(a,b,c);
        System.out.println("pythagorean triplet: "+result);
    }
    static boolean isPythagorean(int a,int b, int c){
        return a * a + b * b == c * c;
    }
}
