package com.saikat;

import java.util.Scanner;

public class LargestValueN {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter your number: ");
        int num = 1;
       // int []arr = new int[50];

        int max = num;
        //int n;
        while (num>=0){
            if(num == 0){
                break;
            }
            num = sc.nextInt();
            max = Math.max(max,num);
        }
        System.out.println("The largest value is :"+max);
    }
}
