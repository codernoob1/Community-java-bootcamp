package com.saikat;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number : ");
        float firstNum = sc.nextFloat();

        System.out.print("Enter second number : ");
        float secondNum = sc.nextFloat();

        System.out.print("Enter a operation you want to perform : ");
        String operation = sc.next();

        if (operation.equals("+")){
            System.out.println("The sum of two number is : "+(firstNum+secondNum));
        }else if (operation.equals("-")){
            System.out.println("The subtraction of two number is : "+(firstNum-secondNum));
        }else if (operation.equals("*")){
            System.out.println("The multiplication of two number is : "+(firstNum*secondNum));
        }else  {
            System.out.println("The division of two number is : "+(firstNum/secondNum));
        }
    }
}
