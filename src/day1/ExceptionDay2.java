package day1;

import java.util.logging.Logger;

public class ExceptionDay2 {
    private static Logger log=Logger.getLogger(ExceptionDay2.class.getName());

    public static void main(String[] args) {
        int []arr={10,12,14,15,16,18};
        log.info("lets access these elements");
        try {
            System.out.println(arr[2]);
        } catch (ArrayIndexOutOfBoundsException e)
        {
            log.warning("plaese enter a valid indexes");
        }
    }
}
