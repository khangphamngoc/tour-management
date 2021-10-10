package util;
import java.util.Scanner; // Su dung thu vien Scanner trong package java.util
 /**
  * Class input utilities
  */
public class InputUtil {
    static Scanner sc = new Scanner(System.in);
    public static double PI = 3.14;

    /**
     * static method getString 
     */
    public static String getString() {
        String in = sc.nextLine();
        return in;
    }

    public static int getInt() {
        int out = 0;
        boolean f = false;
        do {
            try {
                String in = getString();
                // Co gang thuc thi 1 khoi lenh
                // Convert tu string sang integer
                out = Integer.valueOf(in);
                f = true;
            } catch (Exception e) {
                System.out.println("Invalid, try again!");
                //TODO: Xu ly ngoai le/loi neu co
                //e.printStackTrace();
            } 
        } while(!f);
        return out;
    }

    public static float getFloat() {
        String in = getString();
        float out = 0;
        try {
            // Co gang thuc thi 1 khoi lenh
            // Convert tu string sang float
            out = Float.valueOf(in);
        } catch (Exception e) {
            System.out.println("Invalid, try again!");
            //TODO: Xu ly ngoai le/loi neu co
            e.printStackTrace();
        }
        return out;
    }

}