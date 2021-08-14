package com.saikat;

import java.util.Scanner;

public class SumOfInput {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter your number: ");
        int num = 1;
        int sum = 0;
        
        while (num>=0){
            if(num == 0){
                break;
            }
            num = sc.nextInt();
            sum+=num;
        }
        System.out.println("The sum of entered is : " +sum);
    }
}
