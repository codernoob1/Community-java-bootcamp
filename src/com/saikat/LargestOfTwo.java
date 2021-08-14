package com.saikat;

import java.util.Scanner;

public class LargestOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first  number: ");
        float firstNum = sc.nextFloat();

        System.out.println("Enter second number:  ");
        float secondNum = sc.nextFloat();

        if(firstNum > secondNum){
            System.out.println("The largest number among two is : "+firstNum);
        }else {
            System.out.println("The largest number among two is : "+secondNum);
        }
    }
}
