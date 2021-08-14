package com.saikat;

import java.util.Scanner;

public class RupeeDollar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Rupee : ");
        float rupee = sc.nextFloat();

        float dollar = rupee/75;
        System.out.println("Your entered rupee in dollar is :"+dollar+"$");
    }
}
