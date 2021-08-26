package com.saikat;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int number = sc.nextInt();

        String result = isEven(number);
        System.out.println(result);
    }
    static String isEven (int n){
        if (n % 2==0){
            return "Even Number";
        }
        return "Odd number";
    }
}
