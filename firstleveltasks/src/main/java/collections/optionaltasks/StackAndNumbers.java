package collections.optionaltasks;

import java.util.Scanner;
import java.util.Stack;

import static java.lang.Character.isDigit;

public class StackAndNumbers {
    public static void main(String[] args) {
        char charTemp;
        int notNumber = 0;
        System.out.println("Введите число и нажмите <Enter>:");
        Scanner scan = new Scanner(System.in);
        String inputString = scan.nextLine();
        try {
            Double.parseDouble(inputString);
            Stack<Character> stack = new Stack<>();
        for (int i = 0; i < inputString.length(); i++) {
            charTemp = inputString.charAt(i);
            if (isDigit(charTemp)) {
                stack.push(charTemp);
            } else {
                notNumber++;
            }
        }
            System.out.print("Число, у которого цифры идут в обратном порядке : ");
        for (int i = 0; i < inputString.length() - notNumber; i++) {
            System.out.print(stack.pop());
        }
        } catch (NumberFormatException e) {
            System.out.println("Не число : " + inputString);
        }
    }
}
