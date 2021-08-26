package com.saikat;

import java.util.Scanner;

public class MinimumMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        System.out.println("The max is:"+max(a,b,c));
        System.out.println("The min is:"+min(a,b,c));
    }
    static int max(int a ,int b, int c){
        int max = a;
        if (a<b){
            max = b;
        }
        if (max< c){
            max = c;
        }
        return max;
    }
    static int min (int a , int b ,int c){
        int min = a;
        if (a>b){
            min = b;
        }
        if (min>c){
            min = c;
        }
        return min;
    }
}
