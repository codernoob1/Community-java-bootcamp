package com.saikat;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        float num1 = input.nextFloat();
//        float num2 = input.nextFloat();
//
//        float sum = num1+ num2;
//        System.out.println("Sum = "+sum);

        //typecasting
        int num = (int )(64.87f);
        //System.out.println(num);

        //automatic type promotion in expressions
        int a = 257;
        byte b= (byte) (a);// byte can only hold 256 , if you try to store bigger value it will 257% 256 =1
       // System.out.println(b);

        byte c= 40;
        byte d = 50;
        byte e = 100;
        int result = c*d/e;
       // System.out.println(result);//c*d actually exceeds byte range though it gives us correct result ,because java treat expression as integer

        int number = 'a';
       // System.out.println(number);//ascii value can print any language because unicode

        byte g = 42;
        char f = 'a';
        short s = 1024;
        int i= 50000;
        float fl = 5.67f;
        double db = 0.1234;
        double result1 = (fl * g) + (i/f)-(db * s);
        //float + int - double = (what is the biggest one in this expression that will be result)double
        System.out.println((fl * g) +" "+ (i/f)+" "+(db * s));
        System.out.println(result1);
    }
}
