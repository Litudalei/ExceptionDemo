package Ternary;

import java.util.Scanner;

public class TernaryEvenOrOdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        String result=(num%2==0)?"even":"odd";
        System.out.println(result);
    }
}
