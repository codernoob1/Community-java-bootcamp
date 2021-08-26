package com.saikat;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int num = sc.nextInt();

        boolean ans = isPalindrome(num);
        System.out.println(ans);
    }
    static boolean isPalindrome(int n){
        int temp = n;
        int sum = 0;
        while (n> 0){
            int rem = n % 10;
            sum = (sum*10)+rem;
            n/=10;
        }
        return temp == sum;
    }
}
