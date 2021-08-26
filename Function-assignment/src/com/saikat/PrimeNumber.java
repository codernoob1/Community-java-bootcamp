package com.saikat;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int number = sc.nextInt();

        boolean result = isPrime(number);
        System.out.println(result);
    }
    static boolean isPrime(int n){
        if (n==1){
            System.out.println("Neither Prime nor Composite");
            return false;
        }
        int c = 2;
        while (c*c <=n){
            if (n % c == 0){
                return false;
            }
            c++;
        }
        return true;
    }
}
