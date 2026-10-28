package Ternary;

import java.util.Scanner;

public class PositiveOrNagative {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        String result=(num>0)?"Positive ":"Nagative";
        System.out.println(result);
    }
}
