package com.saikat;

import java.util.Scanner;

public class FactorOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        for (int i = 1 ; i<=10 ; i++){
            if (num % i== 0){
                System.out.println("The factors of given number is :"+i);
            }
        }
    }
}
