package com.saikat;

import java.util.Scanner;

public class Vote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter your age: ");
        int age = sc.nextInt();

        String ch = isEligible(age);
        System.out.println(ch);
    }
    static String isEligible(int age){
        if (age >=18){
            return "You're eligible for vote";
        }
        return "You're not eligible";
    }
}
