package com.saikat;

import java.util.Scanner;

public class GradeCard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks: ");
        int marks = sc.nextInt();

        String result = Grade(marks);
        System.out.println("Your grade is: "+result);
    }
    static String Grade(int marks){
        if (marks>=91 && marks<=100){
            return "AA";
        }else if (marks>=81 && marks<=90){
            return "A+";
        }else if (marks>=71 && marks<=80){
            return "A";
        }else if (marks>=61 && marks<=70){
            return "B+";
        }else if (marks>=51 && marks<=60){
            return "B";
        }else if (marks>=41 && marks<=50){
            return "C";
        }else if (marks>=31 && marks<=40){
            return "D";
        }else if (marks>=0 && marks<=30){
            return "Fail";
        }
        return "Invalid value";
    }
}
