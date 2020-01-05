package fundamentals.maintask;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task5 {
    public static void main(String[] args) {
        System.out.println("Введине число от 1 до 12");
        Scanner scan = new Scanner(System.in);
        String number = scan.nextLine();
        if ((number.length() == 1) || (number.length() == 2)) {
            Pattern isItNumber = Pattern.compile("\\d{1,2}");
            Matcher matcherIsItNumber = isItNumber.matcher(number);
            if (matcherIsItNumber.find()) {
                switch (Integer.parseInt(number)) {
                    case (1):
                        System.out.println("January");
                        break;
                    case (2):
                        System.out.println("February");
                        break;
                    case (3):
                        System.out.println("March");
                        break;
                    case (4):
                        System.out.println("April");
                        break;
                    case (5):
                        System.out.println("May");
                        break;
                    case (6):
                        System.out.println("June");
                        break;
                    case (7):
                        System.out.println("July");
                        break;
                    case (8):
                        System.out.println("August");
                        break;
                    case (9):
                        System.out.println("September");
                        break;
                    case (10):
                        System.out.println("October");
                        break;
                    case (11):
                        System.out.println("November");
                        break;
                    case (12):
                        System.out.println("December");
                        break;
                    default:
                        System.out.println("INCORRECT INPUT DATA");
                        break;
                }
            } else
                System.out.println("INCORRECT INPUT DATA");
        } else
            System.out.println("INCORRECT INPUT DATA");
    }
}