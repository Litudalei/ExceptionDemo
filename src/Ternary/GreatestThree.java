package Ternary;

public class GreatestThree {
    public static void main(String[] args) {
        int a=20;
        int b=70;
        int c=40;
        int result=(a>b)?((a>c)?a:c):((b>c)?b:c);
        System.out.println("greatest of all three number "+result);
    }
}
