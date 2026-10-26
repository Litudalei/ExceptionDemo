package day1;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Logger;

public class ExceptionDemoDay1 {
    private static Logger logger=Logger.getLogger(ExceptionDemoDay1.class.getName());
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter  a number");
        try {
            float num = sc.nextFloat();
            System.out.println("the number we got :"+num);
        }
        catch(InputMismatchException e)
        {
            logger.warning("Plaese a enter a number with respect to data types");
        }

    }
}
