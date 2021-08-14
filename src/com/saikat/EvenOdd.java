//2. Write a program to print whether a number is even or odd, also take input.
    
package com.saikat;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter any number: ");
        int number = sc.nextInt();
        if(number % 2 == 0){
            System.out.println("Even number");
        }else{
            System.out.println("Odd number");
        }
    }
}
