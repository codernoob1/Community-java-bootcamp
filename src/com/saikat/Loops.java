package com.saikat;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        /*
        syntax of for loop
        for (initialization ; condition ; increment/decrement){
            //body
        }
         */
        // print 1 to 5 number
//        for (int num = 1; num <= 5;num++){
//            System.out.println(num);
//        }
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        for (int num = 1; num <=n ; num++) {
//            System.out.println("Hello world!");
//        }
        //while loops
        /*
        syntax
        while(condition){
            //body
            increment/decrement
        }
         */
//        int num = 1;
//        while (num<=5){
//            System.out.println(num);
//            num++;
//        }
        //do while
        /*
            do{
                //body
            }while(conditions)
         */
        int n = 1;
        do {
            System.out.println(n);
            n++;
        }while (n<=5);
    }
}
