package com.saikat;

import java.util.Scanner;

public class SumNatural {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter how many natural numbers you want to add: ");
        int num = in.nextInt();

        int result = natural(num);
        System.out.print("the sum of natural is: "+result);
    }
    static int natural(int n){
        return (n*n+n)/2;
    }
}

