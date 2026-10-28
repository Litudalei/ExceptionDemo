package Ternary;

import java.util.Scanner;

public class TernaryVoterDemo {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your age");

        int age=sc.nextInt();
        String result=(age>18)?"eligible for voting":"adult not eligible for voting";
        System.out.println(result);
    }
}
