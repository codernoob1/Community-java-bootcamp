package com.saikat;

import java.util.Scanner;

public class OccurringNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("enter a number: ");
//        int num = sc.nextInt();
        int num = 45535;
        int count = 0;

        while (num>0){
            int rem = num %10;
            if(rem == 5){
                count++;
            }
            num = num /10;
        }
        System.out.println(count);
    }
}
