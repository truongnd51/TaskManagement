/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author duytr
 */
public class Validation {

    private static final Scanner sc = new Scanner(System.in);
    private static final String PLAN_VALID = "^[0-9]{1,2}\\.5|[0-9]{1,2}\\.0$";

    public static int getInt(String mess, String errorNumberFormat, int min, int max) {
        while (true) {
            int ret = Integer.parseInt(getStringByRegex(mess, errorNumberFormat, "[0-9]+"));
            if (ret < min || ret > max) {
                System.err.println("Please enter number in rage [" + min + ", " + max + "]");
            } else {
                return ret;
            }
        }

    }

    public static String getStringByRegex(String mess, String error, String regex) {
        Scanner scan = new Scanner(System.in);
        String output;
        while (true) {
            System.out.print(mess);
            output = scan.nextLine();
            if (output.matches(regex)) {
                return output;
            } else {
                System.err.println(error);
            }
        }
    }

    public static String getInputTaskTypeId() {
        while (true) {
            System.out.println("LIST OF TASK TYPES: ");
            System.out.println("1. Code");
            System.out.println("2. Test");
            System.out.println("3. Design");
            System.out.println("4. Review");
            int n = getInt("Enter task type: ", "Please enter Integer!", 1, 4);
            String result = null;
            switch (n) {
                case 1:
                    result = "Code";
                    break;
                case 2:
                    result = "Test";
                    break;
                case 3:
                    result = "Design";
                    break;
                case 4:
                    result = "Review";
            }
            return result;
        }
    }

    public static String getInputPlan(String mess, String errorNumberFormat) {
        System.out.print(mess);
        while (true) {
            String result = sc.nextLine().trim();
            if (result.matches(PLAN_VALID) && Double.parseDouble(result) >= 8.0
                    && Double.parseDouble(result) <= 17.5) {
                return result;
            } else {
                System.err.print(errorNumberFormat);
            }
        }
    }

    public static String getInputDate(String mess, String errorDateFormat) {
        System.out.print(mess);
        
        while (true) {
            try {
                Date date = new Date(); 
                String result = sc.nextLine();
                SimpleDateFormat dateFormatter = new SimpleDateFormat("dd/MM/yyyy");
                SimpleDateFormat dateFormatter2 = new SimpleDateFormat("dd/MMM/yyyy",Locale.US);
                dateFormatter.setLenient(false);
                date = dateFormatter.parse(result);
                    return dateFormatter.format(date);
                
                
            } catch (ParseException e) {
                System.err.println(errorDateFormat);
            }
        }
    }
}
