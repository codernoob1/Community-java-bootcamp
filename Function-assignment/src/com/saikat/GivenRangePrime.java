package com.saikat;

import java.util.Scanner;

public class GivenRangePrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the starting range: ");
        int start = sc.nextInt();
        System.out.println("Enter the ending range: ");
        int end = sc.nextInt();

        for (int i = start;i<=end;i++){
            if (isPrime(i)){
                System.out.print(i+" ");
            }
        }

    }
    static boolean isPrime(int n){
        if (n==1){
            System.out.println("Neither prime nor composite");
            return false;
        }
        int c = 2;
        while (c*c<=n){
            if (n % c==0){
                return false;
            }
            c++;
        }
        return true;
    }
}
